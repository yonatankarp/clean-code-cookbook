package com.yonatankarp.cleancodecookbook.chapter3.after

class Window(
    private val width: Int,
    private val height: Int,
    children: List<Window>,
) {
    private val children = children.toMutableList()

    fun width() = width
    fun area() = width * height
    fun addChildren(aChild: Window) = children.add(aChild)
    // Do not expose internal attributes
}
