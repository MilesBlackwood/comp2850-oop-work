fun main(){
    var orderMessage = ""
    while(orderMessage != "Order Accepted"){
        println("PIZZA MENU\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\nChoose your pizza (a-d):")
        val pizzaChoice = readln().lowercase().toString()
        orderMessage = if (pizzaChoice in "a".."d" && pizzaChoice.length == 1){
            "Order Accepted"
        }
        else{
            "Invalid Choice!"
        }
        println(orderMessage)
    }
}