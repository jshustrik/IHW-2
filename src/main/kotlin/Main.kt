import java.util.Scanner;

fun main() {
    // Initializing data.
    val program = Program(
        0,
        mutableListOf( User("Julia", "BestProgrammer")),
        mutableListOf(),
        mutableListOf()
        //mutableListOf()
    )

    val commandExecutor = CommandExecutor()

    // Choosing an option of using program.
    var input : String? = ""
    while (input != "Visitor" && input != "Admin") {
        println("Continue as:")
        println("   Visitor")
        println("   Admin\n")
        print("Your option: ")
        input = readln()
    }
    println()

    try {
        // Starts main program logic.
        commandExecutor.executeCommand(input, program)

    } catch (ex: Exception) {
        println("Something went wrong - ${ex.message}")
    }
}
