// Task 5.3.2: dice rolling simulation
// Task 5.1.2: die rolling simulation
import kotlin.random.Random
import kotlin.system.exitProcess

fun rollDie(sides: Int = 6, rolls: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        for (i  rolls){
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")
            i += 1
        }
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readInt(input: String) = input.toInt()
    

fun main(inp: Array<String>){  
    if (inp.size == 0){
        rollDie()
    }
    else if (inp.size == 1){
        rollDie(readInt(inp[0]))
        
    }

    else if (inp.size == 2){
        rollDie(readInt(inp[0]), readInt(inp[1]))
    }
    else{
        println("Invalid input")
        exitProcess(1)
    }
}