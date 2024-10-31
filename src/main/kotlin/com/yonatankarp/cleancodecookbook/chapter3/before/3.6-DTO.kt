package com.yonatankarp.cleancodecookbook.chapter3.before

class Friend
class UserFeed

class SocialNetworkProfile(
    private val userName: String,
    private val friends: List<Friend>, // friends is a reference to a large collection
    private val feed: UserFeed, // feed references the whole user feed
) {
    init {
        assertUsernameIsValid(userName)
        assertNoFriendDuplicates(friends)
        assertNoFriendOfMyself(friends)
    }

    private fun assertUsernameIsValid(userName: String): Unit = TODO()
    private fun assertNoFriendDuplicates(friends: List<Friend>): Unit = TODO()
    private fun assertNoFriendOfMyself(friends: List<Friend>): Unit = TODO()
}

// If you need to transfer to an external system, you need
// to duplicate (and maintain) the structure
class SocialNetworkProfileDTO(
    var userName: String? = null,
    var friends: List<String>? = null,
    var feed: UserFeed? = null,
) {
    // Empty constructor for serialization purposes
    // No validations, as this is strictly for transferring data
}

// If you need to transfer to an external system, you create an anemic DTO
val janesProfileToTransfer = SocialNetworkProfileDTO()
