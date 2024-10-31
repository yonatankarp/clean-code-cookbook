package com.yonatankarp.cleancodecookbook.chapter3.before


import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.findAnnotation

@Target(AnnotationTarget.PROPERTY)
annotation class ValidateWith(val validator: KClass<out Validator<*>>)

interface Validator<T> {
    fun validate(value: T): T
}

object IntegerValidator : Validator<Int> {
    override fun validate(value: Int) = value
}

object StringValidator : Validator<String> {
    override fun validate(value: String) = value
}

object BooleanValidator : Validator<Boolean> {
    override fun validate(value: Boolean) = value
}

class Employee {
    @ValidateWith(IntegerValidator::class)
    var id: Int = 0

    @ValidateWith(StringValidator::class)
    var name: String = ""

    @ValidateWith(BooleanValidator::class)
    var currentlyWorking: Boolean = false

    init {
        validateProperties()
    }

    private fun validateProperties() {
        val instance = this
        this::class.declaredMemberProperties
            .filterIsInstance<KMutableProperty<*>>()
            .forEach { property ->
                property.findAnnotation<ValidateWith>()
                    ?.validator
                    ?.objectInstance
                    ?.let { it as? Validator<Any> }
                    ?.let { validator ->
                        property.getter.call(instance)
                            ?.let { validator.validate(it) }
                            ?.let { validatedValue -> property.setter.call(instance, validatedValue) }
                    }
            }
    }
}

fun main() {
    val john = Employee().apply {
        id = 1
        name = "John"
        currentlyWorking = true
    }

    println(john.name) // returns 'John'
}



