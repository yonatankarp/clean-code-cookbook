package com.yonatankarp.cleancodecookbook.chapter3.after


class SocialNetworkProfile(
    private val userName: String,
    private val friends: FriendsCollectionProtocol,
    private val feed: UserFeedBehavior,
) {
    init {
        assertUsernameIsValid(userName)
        assertNoFriendDuplicates(friends)
        assertNoFriendOfMyself(friends)
    }

    private fun assertUsernameIsValid(userName: String): Unit = TODO()
    private fun assertNoFriendDuplicates(friends: FriendsCollectionProtocol): Unit = TODO()
    private fun assertNoFriendOfMyself(friends: FriendsCollectionProtocol): Unit = TODO()

    // lots of protocol associated with the profile
    // No serialization protocol
    // No behavior or attribute duplication
}

sealed class FriendsCollectionProtocol
class FriendsCollection : FriendsCollectionProtocol() {
    // proxy protocol
    // travels as a lightweight object and can get contents when requested
}

sealed class UserFeedBehavior
data object UserFeed : UserFeedBehavior()
data object NullFeed: UserFeedBehavior() {
    // throws an error when requested for behavior
}

// If you need to transfer to an external system, you create a valid object
val janesProfileToTransfer = SocialNetworkProfile(
    userName = "Jane",
    friends = FriendsCollection(),
    feed = UserFeed,
)
