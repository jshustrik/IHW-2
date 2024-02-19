//@kotlinx.serialization.Serializable
data class Visitor(
    val id: Int,
    val login: String,
    var password: String,
    var wallet: Int,
//    val tickets: MutableList<Ticket>,
//    val requests: MutableList<Request>
) {
    fun fillWallet() {
        print("Input payment: ")
        var payment: Int? = readln().toIntOrNull()
        while (payment == null || payment < 0) {
            print("Input correct payment: ")
            payment = readln().toIntOrNull()
        }
        wallet += payment
        println()
    }

    fun showAmountOfCash() {
        println("Amount of cash in your wallet: $wallet\n")
    }

    fun changePassword() {
        print("Enter new password: ")
        password = readln()
        println()
    }
}
