/* Syler Rimbach
Product.kt
2/6/2023
Homework 4
Mobile Application Development CS369
 */

open class Product(val productName: String) {


    open var price: Double = 0.0
    open var quantity: Int = 0

    open fun totalPrice(): Double{
        val total = price * quantity
        println("The total price of $productName is: $total")
        return total
    }

    fun add(x: Int){
        quantity += x
        println("New quantity of $productName: $quantity")
    }

    fun subtract(x: Int){
        quantity -= x
        println("New quantity of $productName: $quantity")
    }
}