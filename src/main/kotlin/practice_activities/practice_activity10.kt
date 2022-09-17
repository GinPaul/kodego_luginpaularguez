package practice_activities

fun main(){

    var phone = SmartPhone(20.0, 50)

    println("Functions:")
    phone.buyLoad(100.0)
    phone.chargeBattery(1)
    phone.sendText("")


}
class SmartPhone(var load: Double, var batteryPercentage: Int) {

    init {
        println("Object Created!")
        println("******************")
        println()
        println("Welcome to your phone!")
        println()
        println("Your initial load is Php$load and the battery is $batteryPercentage%.")
        println()
    }

    //functions
    fun buyLoad(amountLoaded: Double) {
        if (amountLoaded > 0) {
            var newLoad = load + amountLoaded
            println("Loading succeeded!")
            println("You have loaded Php$amountLoaded and the new load amount is Php$newLoad.")
            println("**********")
            println()
        } else {
            println()
            println("Invalid Amount!")
            println("Please try again.")
            println("**********")
            println()
        }
    }

    fun chargeBattery(charged: Int) {
        var newCharge = batteryPercentage + charged
        if (newCharge <= 100 && charged > 0) {
            println("Charging succeeded!")
            println("The current charge is $newCharge%.")
            println("**********")
            println()
        } else if (newCharge <= 100 && charged <= 0) {
            println()
            println("Charging error!")
            println("Please recharge.")
        } else {
            println("WARNING: Charging overload!")
            println("Please unplug your phone.")
            println("**********")
            println()
        }
    }

    fun sendText(message: String) {
        var messagesSent = mutableListOf<String>()
        println("Please compose your message and press enter:")
        var yourMessage = readln()
        messagesSent.add(yourMessage)
//        println("Your message is sent. Do you want to send another message [Y or N]?")
//        var yesOrNo = readln()

        do {
            println("Your message is sent. Do you want to send another message [Y or N]?")
            var yesOrNo = readln()
            if (yesOrNo == "Y") {
                println("Please compose your message.")
                var yourMessage2 = readln()
                messagesSent.add(yourMessage2)
            } else if (yesOrNo == "N") {
                println("Thank you for using the sms service.")
                break
            } else if (yesOrNo !== "Y" && yesOrNo !== "N") {
                println("Incorrect response. Please choose Y for Yes or N for No.")
            }

        } while (yesOrNo !== "N")
        println("You have sent the following messages $messagesSent.")
        println("The total number of messages you sent is/are ${messagesSent.size}")

    }
//    var remainingLoad = newLoad - messagesSent.size
//    println("Your remaining load balance is $newLoad ")

}














//        var ctr: String = ""
//        while (ctr <= 100.toString()) {
//            println("Compose your message and press enter ${ctr + 1}:")
//            var input = readln()
//            messagesSent.add(input)
////            ctr++
//            break



//
//        var answer: String = ""
//        answer = readln()
//        for(answer == "Y"){
//            println("Compose your message")






//USE READLN() HERE
//    fun messageSent(charged: Int) {
//        if (charged > 100) {
//            var newCharge = batteryPercentage + charged
//            println("Charging succeeded!")
//            println("The current charge is $newCharge%.")
//            println("**********")
//            println()
//        }else{
//            println()
//            println("WARNING: Charging overload!")
//            println("Please unplug your phone.")
//            println("**********")
//            println()
//        }
//    }






//    fun screenWrite (){
//        println("Allows writing on the screen without opening the phone.")
//    }
//    fun band (){
//        println("Browse faster with 5G.")
//    }
//    fun allDayBattery (){
//        println("Longer battery life than can last a day with continued use.")
//    }
//    fun digitalZoom (){
//        println("Zoom in on your object with 30x digital zoom.")
//    }
