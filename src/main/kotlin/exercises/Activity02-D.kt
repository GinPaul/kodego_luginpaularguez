package exercises

//var student1 = mutableMapOf("abc" to 1)
//var studentNumber: Int = 0
//var studentName1: String = ""
//var age1: Int = 0
//var sex1: String = ""
//var address1: String = ""
//var isEnrolled1: String = ""
//var section1: String = ""
//var emailAddress1: String = ""
//var mobileNumber1: Long = 0
//var currentScore1: Double = 0.0


fun main() {

//    do {
//        try {
//            println("Enter Student Number:")
//            studentNumber = readln().toInt()
//            break
//        } catch (e: NumberFormatException) {
//            println(e)
//            println("Invalid input. Try again.")
//            println()
//        }
//    } while (true)
//
//
//    println("Enter Full Name:")
//    studentName1 = readln()
//
//    do{
//        try {
//            println("Enter Age:")
//            age1 = readln().toInt()
//            break
//        } catch (e: NumberFormatException) {
//            println(e)
//            println("Invalid input. Try again.")
//            println()
//        }
//    }while (true)
//
//    println("Enter Sex:")
//    sex1 = readln()
//
//    println("Enter Address:")
//    address1 = readln()
//
//    println("Is this person enrolled?:")
//    isEnrolled1 = readln()
//
//    println("Section Name:")
//    section1 = readln()
//
//    println("Email Address:")
//    emailAddress1 = readln()
//
//    do{
//        try {
//            println("Mobile Number:")
//            mobileNumber1 = readln().toLong()
//            break
//        } catch (e: NumberFormatException) {
//            println(e)
//            println("Invalid input. Try again.")
//            println()
//        }
//    }while(true)
//
//    do{
//        try {
//            println("Current Score:")
//            currentScore1 = readln().toDouble()
//            break
//        } catch (e: Exception) {
//            println(e)
//            println("Invalid input. Try again.")
//            println()
//        }
//    }while (true)
//
//
    var directory = StudentDirectory("Lugin Paul Arguez", 200138924)
    directory.name()
    directory.studentno()



}
class StudentDirectory (var studentName: String, var studentNum: Int){
    init {
        println("Welcome to the Student Directory!")
        println()
    }

    fun name(){
        println("Student Name is $studentName")
    }

    fun studentno(){
        println("Student number is $studentNum")
    }

}


