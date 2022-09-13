package practice_activities

import practice_activities.isPrimeNumber
import kotlin.math.max

fun main() {

    var numbers = mutableListOf<Int>()
    var numbers2: Int = 0

    //for(i in 1..3){
    //println("Enter number $i")
    //var input : Int = readln().toInt()
    //numbers.add(input)
    //}
    //println()

    println(maxNumber(3, 6, 4))


}
fun maxNumber(num1:Int, num2:Int, num3:Int):Int{
    var maxValue = 0

    if((num1 > num2) && (num1 > num3)){
        maxValue = num1
    }else if((num2 > num1) && (num2 > num3)){
        maxValue = num2
    }else if((num3 > num1) && (num3 > num2)){
        maxValue = num3
    }

    println("The maximum value is:")
    return maxValue
}
