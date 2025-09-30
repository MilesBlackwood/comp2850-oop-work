// Task 3.1: command line arguments
import kotlin.system.exitProcess
fun main(args: Array<String>){
    if (args.size != 2){
        println("More or less than 2 arguements were supllied")
        exitProcess(1)
    }
    println(args[0].toString())
    println(args[1].toString())
}