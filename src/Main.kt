/* Syler Rimbach
Main.kt
2/6/2023
Homework 4
Mobile Application Development CS369
 */

fun main(){
    var pizza:FrozenFood = FrozenFood("Red Baron Frozen Pizza",.10, 100, 4.99)
    pizza.totalPrice()

    var letters = arrayOf('a', 'b', 'c', 'd', 'e')

    for(n in 0 .. 4){
        println("${letters[n]}")
    }

    val numbers = mutableListOf(5,4,3)

    numbers.add(1)
    numbers.add(2)
    numbers.set(0,8)

    val iterator = numbers.iterator()

    while(iterator.hasNext()){
        println("${iterator.next()}")
    }
}