fun main(){
    //Loops using repeat
    //repetition or iteration
    repeat(times = 5){
        println("Hello World")
    }

    println()

    //repetition with number/counter sample 1
    repeat(times = 5){ctr ->
        println("Hello World $ctr")

    }

    println()

    //repetition with number/counter sample 2
    repeat(times = 5) { item ->
        println("Hello World $item")
    }

}