package Commands

import Command
import Methods
import Program
import Dish

class AddDishCommand : Command {
    override fun execute(request: String?, program: Program) {
        print("Input the name of the dish: ")
        val name = readln()
        print("Input amount of dish: ")
        val count = Methods.validateInput()
        print("Input the price of the dish: ")
        val price = Methods.validateInput()
        print("Input the cooking time of the dish: ")
        val time = Methods.validateInput()
        program.dishes.add(Dish(Methods.generateID(), name, count, price, time))
        print("The dish has been successfully added!")
    }
}