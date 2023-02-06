/* Syler Rimbach
FrozenFood.kt
2/6/2023
Homework 4
Mobile Application Development CS369
 */

class FrozenFood(val name: String, var costToStore: Double, override var quantity: Int, override var price: Double): Product(name) {

    val storageTemp: Int = 0

    override fun totalPrice(): Double{
        val total = price * quantity + costToStore * quantity
        println("The total price of $name is: $total")
        return total
    }

    fun currentTempDifference(temp: Int){
        val tempDifference: Int = temp - storageTemp
        if(tempDifference > 0){
            println("$name is being stored too hot, store at ${storageTemp}F or cooler")
        } else {
            println("$name is being stored at an acceptable temperature")
        }
    }
}