package practice_activities

fun main(){

    var age : Int = 24
    if((age >= 0)&&(age <= 17)){
        println("Under age")
    }else if((age >=18)&&(age <=30)){
        println("Young adult")
    }else if ((age >=31)&&(age <=59)){
        println("Adult")
    }else if(age > 60) {
        println("Senior")
    }else {
        println("Invalid age!")
    }

}