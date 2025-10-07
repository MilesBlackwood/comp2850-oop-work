// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circleCircumeference(radius: Double) = PI * radius * 2

fun readDouble(input: String) = input.toDouble()

fun main(){
    println("Enter the radius:\n")
    val inp = readln()
    val radius = readDouble(inp)
    val area = circleArea(radius)
    val circumference = circleCircumeference(radius)
    print("A circle with a radius of $radius has an area of $area and a circumference of $circumference")
}