fun main(){
    //loop within a loop

    var ctr1 : Int = 1
    while(ctr1 <= 5){  //1st loop to display 5x, while it is not 5 it will continue to loop
        var ctr2 : Int = 1
        while(ctr2 <=5){  //2nd loop to display 5 repetitions of the "@"
            print("@")
            ctr2++
        }
        println()
        ctr1++
    }

    //will display five "@" five times

}