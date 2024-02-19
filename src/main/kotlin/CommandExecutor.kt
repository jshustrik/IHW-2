import Commands.AddDishCommand
import Commands.ShowDishesCommand
import Commands.StartAdminCommand
import Commands.StartVisitorCommand

internal class CommandExecutor {
    var map: MutableMap<String, Command>

    init {
        map = HashMap()
        map["Visitor"] = StartVisitorCommand()
        map["Admin"] = StartAdminCommand()
        map["Show information about dishes"] = ShowDishesCommand()
        map["Add dish"] = AddDishCommand()
        //map["Change password"] = visitor.changePassword()
    }

    fun executeCommand(request: String, program: Program) {
        val command = map[request]
        if (command != null) {
            command.execute(request, program)
        } else {
            throw IllegalArgumentException("Wrong command! Try again, please")
        }
    }
}