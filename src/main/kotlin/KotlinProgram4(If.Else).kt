fun main(){
    var number : Int = 10

    if(number == 10){
        println("Hello")
    }

    var grade : Int = 74
    if(grade >= 75){
        println("You Passed")
    }else{
        println("you failed")
    }

    var grade1 : Int = 74
    if((grade1 >= 96)&&(grade1 <= 100)){
        println("1.00")
    }else if((grade1 >=86)&&(grade1 <=95)){
        println("1.75")
    }else if ((grade1 >=76)&&(grade1 <=85)){
        println("2.25")
    }else if(grade1 < 75) {
        println("5.0")
    }else{
        println("Invalid grade!")
    }


    //range
    var idNumber : Int = 1
        //true statement      //true statement
    if((idNumber >= 1)&&(idNumber <= 3)){
        println("valid ID number")
        println("SUCCESS!!")
    }


    println("Line ends")
}