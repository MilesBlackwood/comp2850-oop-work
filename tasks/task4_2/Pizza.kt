fun main(){
    println("PIZZA MENU\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\nChoose your pizza (a-d):")
    val pizzaChoice = readln().lowercase().toString()
    val orderMessage = if (pizzaChoice in "a".."d" && pizzaChoice.length == 1){
        "Order Accepted"
    }
    else{
        "Invalid Choice!"
    }
    println(orderMessage)
}