class Methods {
    companion object {
        public fun generateID() : Int {
            val rnd = (0..1000).random()
            return rnd
        }

        public fun validateInput() : Int {
            var input: Int? = readln().toIntOrNull()
            while (input == null || input <= 0) {
                print("Incorrect input. Input must be positive integer. Try again: ")
                input = readln().toIntOrNull()
            }
            return input
        }
    }

}