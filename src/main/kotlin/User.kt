// @kotlinx.serialization.Serializable
class User(
    var userName: String,
    var password: String
) {
    fun changePassword() {
        print("Enter new password: ")
        password = readln()
        println()
    }
}
