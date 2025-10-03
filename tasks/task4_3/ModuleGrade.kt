import kotlin.system.exitProcess
import kotlin.math.roundToInt
fun main(args: Array<String>){
    val argsInt = args.map{it.toInt()}
    argsInt.forEach{
        if (it !in 0..100){
            println("Invalid grade value")
            exitProcess(1)
        }
    }
    if(args.size != 3){
        println("Invalid number of values supplied")
        exitProcess(2)
    }



    else{
        val roundedMarks = (argsInt.sum() / 3).toDouble().roundToInt()
        val grade = when (roundedMarks){
            in 0..39 -> "Fail"
            in 40..69 -> "Pass"
            in 70..100 -> "Distinction"
            else -> "?"
        }
        println(grade)
    }
}