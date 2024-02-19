class Program(
    public var currentID: Int,
    public var users: MutableList<User>,
    public var dishes: MutableList<Dish>,
    public var visitors: MutableList<Visitor>
    //private var requests: MutableList<Request>
) {
    fun showAdminMenu(user: User) {
        println("User: ${user.userName}. Choose an option:")
        println("   Show information about dishes")
        println("   Add dish")
        println("   Exit")
//        println("   4. Process requests.")
//        println("   5. Login into another user account.")
//        println("   6. Change password.")
//        println("   7. Add new user.")
        print("\nEnter you option: ")
    }

    fun showVisitorMenu() {
        println("Login with current account or sign in:")
        println("   Login into account")
        println("   Sign in new account\n")
        print("Your option: ")
    }

    fun showVisitorOptions() {
        println("Choose as option:")
//        println("   1. Buy ticket.")
//        println("   2. Refund.")
//        println("   3. Fill up your wallet.")
//        println("   4. Amount of cash in the wallet.")
//        println("   Change password") // вот и как тебя блинб сделать
        print("Your option: ")
    }

}