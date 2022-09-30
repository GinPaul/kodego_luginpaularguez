fun main() {

    println("Enter number 1:")
    var num1: Int = readln().toInt()

    println("Enter number 2:")
    var num2: Int = readln().toInt()

    println("Enter number 3:")
    var num3: Int = readln().toInt()

    var total: Int = num1 + num2 + num3

    println("Total is $total")
    try {
        println("Divide by how many?")
        var divisor: Int = readln().toInt()
        println("The answer is ${total / divisor}")
//        var myArray = arrayOf<Int>(1,2,4,2)
//        myArray[3]
//        println("Hello")
    } catch (e: Exception) { //pwede rin specific ex: (e:ArithmeticException)
        println(e.message)
        println("Exception Occurred!")
    }catch(e:ArithmeticException){
        println(e)
        println("Input digits only!")
    }catch(e:ArrayIndexOutOfBoundsException){
        println(e)
        println("invalid index")
    }finally{
        println("Code finished")
    }

}
//try{
//    file.open(/ path to file /)
//    //do your code
//}catch(e:Exception){
//    //handle exception
//}finally{
//    file.close()
//}