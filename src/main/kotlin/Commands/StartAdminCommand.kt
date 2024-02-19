package Commands

import Command
import CommandExecutor
import Program
import User
import java.lang.Exception

class StartAdminCommand : Command {
    override fun execute(request: String?, program: Program) {
        println("Login with current account:")
        var user = loginUser(program)
        var input: String?
        val commandExecutor = CommandExecutor() // мб я зря второй создала, он уже в мейне есть

        while (true) {
            try {
                program.showAdminMenu(user)
                input = readln()
                println()
                if (input == "Exit") { // мне не нравится этот кусок
                    break
                }
                commandExecutor.executeCommand(input, program)
            } catch (ex: IllegalArgumentException) {
                println("${ex.message}\n")
            } catch (ex: Exception) {
                println("Some error occurred - ${ex.message}\n")
            }
        }
    }

    fun loginUser(program : Program) : User {
        val currentUser: User
        if (program.users.isEmpty()) {
            throw IllegalArgumentException("There is no users.")
        }
        while (true) {
            print("Enter UserName: ")
            val userName = readln()
            if (program.users.find { user -> user.userName == userName } != null) {
                currentUser = program.users.find { user -> user.userName == userName }!!
                break
            }
            println("There is no users with such username.")
        }
        while (true) {
            print("Enter password: ")
            val password = readln()
            if (currentUser.password == password) {
                break
            }
            println("Incorrect password!")
        }
        println()
        return currentUser
    }
}