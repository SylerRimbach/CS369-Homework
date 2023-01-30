/* Syler Rimbach
1/29/2023
Homework 3
Mobile Application Development CS369
 */

public fun getScore(score: Float): String{
    var grade:String = ""

    when(score){

        in 0f .. 59.99f -> grade = "Score of $score is grade of F"

        in 60f .. 63.99f -> grade = "Score of $score is grade of D-"
        in 64f .. 66.99f -> grade = "Score of $score is grade of D"
        in 67f .. 69.99f -> grade = "Score of $score is grade of D+"

        in 70f .. 73.99f -> grade = "Score of $score is grade of C-"
        in 74f .. 76.99f -> grade = "Score of $score is grade of C"
        in 77f .. 79.99f -> grade = "Score of $score is grade of C+"

        in 80f .. 83.99f -> grade = "Score of $score is grade of B-"
        in 84f .. 86.99f -> grade = "Score of $score is grade of B"
        in 87f .. 90.99f -> grade = "Score of $score is grade of B+"

        in 91f .. 92.99f -> grade = "Score of $score is grade of A-"
        in 93f .. 100f -> grade = "Score of $score is grade of A"

        else -> grade = "Score needs to be between 0.00-100.00 to the hundredth place"
    }

    return grade
}

fun main(){
    /*
    println(getScore(59.9f))
    println(getScore(60f))
    println(getScore(60.1f))
    println(getScore(93f))
    println(getScore(92f))
    println(getScore(92.999f))
    println(getScore(-1f))
    println(getScore(100.1f))
    println(getScore(999f))
     */
    val grade: String = getScore(87.89f)

    for(n in 0 .. 5){
        println(grade)
    }
}

