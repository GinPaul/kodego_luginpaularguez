fun main(){

    //debugging

    var num1: Int = 2
    var num2: Int = 3

    var sum:Int = num1 +num2   //add breakpoint by clicking the number at this line. This will stop the code to check the code is running well
    //multiple breakpoints can be placed. press "step into" to see the next step inthe process
    println("The sum of $num1 and $num2 is $sum.")

//    //let's try on the loop
//    var ctr: Int = 1
//    while(ctr <= 5){
//        println(ctr)
//        ctr++
//    }

    //let's try on the nested loop
    var ctr: Int = 1
    while(ctr <= 3){
        var ctr2: Int = 1
        while (ctr2 <=3){
            print("@")
            ctr2++
        }
        println()
        ctr++
    }

}