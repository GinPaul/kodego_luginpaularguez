package practice_activities

fun main(){
    //area of the triangle
    println("Enter the length of the rectangle:")
    var length: Int = readln().toInt()

    println("Enter the width of the rectangle:")
    var width: Int = readln().toInt()

    var resultPerimeter: Int = 0
    var resultArea: Int = 0

    println("The perimeter of the rectangle is ${perimeter(length, width)}.")
    println("The area is ${area(length, width)}.")


}
fun perimeter(length: Int, width: Int): Int{
    return length + length + width + width}


fun area(length: Int, width: Int): Int{
    return length * width}


