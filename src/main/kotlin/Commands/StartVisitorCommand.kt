package Commands

import Command
import CommandExecutor
import Methods
import Program
import Visitor
import java.lang.Exception

class StartVisitorCommand : Command {
    override fun execute(request: String?, program: Program) {
        var input: String? = ""
        var visitor: Visitor
        val commandExecutor = CommandExecutor() // мб я зря второй создала, он уже в мейне есть

        while (true) {
            try {
                while (input != "Login into account" && input != "Sign in new account") {
                    program.showVisitorMenu()
                    input = readln()
                    println()
                }
                visitor = if (input == "Login into account") loginVisitor(program) else signInVisitor(program)
                break
            } catch (ex: IllegalArgumentException) {
                println(ex.message + "\n")
                input = ""
            }
        }

        while (true) {
            try {
                program.showVisitorOptions()
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

    fun loginVisitor(program: Program) : Visitor {
        val currentUser: Visitor
        print("Enter UserName: ")
        val userName = readln()
        if (program.visitors.find { visitor -> visitor.login == userName } == null) {
            throw IllegalArgumentException("There is no users with such username.")
        }
        currentUser = program.visitors.find { visitor -> visitor.login == userName }!!
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

    fun signInVisitor(program: Program) : Visitor {
        print("Input login: ")
        var login = readln()
        while (program.visitors.find { visitor -> visitor.login == login } != null) {
            println("Account with login $login already exists. Choose another login.")
            print("Input login: ")
            login = readln()
        }

        print("Input password: ")
        val password = readln()
        println()

        val visitor = Visitor(Methods.generateID(), login, password, 0)
        program.visitors.add(visitor)
        return visitor
    }
}