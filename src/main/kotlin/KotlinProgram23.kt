fun main(){
    var result: Int = cube(2)
    println(result)

    println(add(5,2))

}

//with return, 1 parameter
fun cube(number:Int):Int{
    var computedCube: Int = number * number * number
    return computedCube

}

//with return, 2 parameter
fun add(number1: Int, number2: Int): Int{
    return number1+number2
}