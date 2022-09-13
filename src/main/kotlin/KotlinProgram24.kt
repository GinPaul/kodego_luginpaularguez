fun main(){

    println(total(2, 4, 4, 6))
    var numbers = arrayListOf<Int>()
    //var numbers = arrayOf<Int>(0,0,0)

    for(i in 1..3){
        println("Enter number $i")
        var input : Int = readln().toInt()
        numbers.add(input)
    }

    //println(total2(*numbers))


    println(total2(2,4,5,6,7,8,9,10,22))




}

fun total(num1: Int, num2: Int, num3: Int, num4:Int): Int{
    println("This is the total function.")
    return num1 + num2 + num3 + num4

}
//varargs - can accept multiple arrays

fun total2(vararg numbers:Int):Int{
    var sumOfAllNumbers: Int = 0;
    for(num in numbers){
        sumOfAllNumbers = sumOfAllNumbers + num
    }
    return sumOfAllNumbers
}