internal interface Command {
    fun execute(request: String?, program: Program)
}