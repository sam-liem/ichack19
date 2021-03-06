package cogni.cogni.model

data class User(
        val id: Long,
        val email: String,
        val name: String,
        val password: String,
        val userType: UserType = UserType.GENERAL,
        val friendRequests : MutableList<FriendRequest> = mutableListOf(),
        var karma: Int = 100
)