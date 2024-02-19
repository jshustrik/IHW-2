package Commands

import Command
import Program

class ShowDishesCommand : Command {
    override fun execute(request: String?, program: Program) {
        if (program.dishes.isEmpty()) {
            println("No sessions loaded now.\n")
            return
        }

        println("DishID Name Count Price Time")
        for (dish in program.dishes) {
            println(dish.getInfo())
        }
        println()
    }
}