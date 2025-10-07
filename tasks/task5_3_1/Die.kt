// Task 5.1.2: die rolling simulation
import kotlin.random.Random
import kotlin.system.exitProcess

fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readInt(input: String) = input.toInt()
    

fun main(sides: Array<String>){  
    if (sides.size != 1 && sides.size != 0){
        println("Invalid input")
        exitProcess(1)
    }
    else if (sides.size == 0){
        rollDie()
    }
    else{
        rollDie(readInt(sides[0]))
    }
}