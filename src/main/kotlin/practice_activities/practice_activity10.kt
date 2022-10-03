package practice_activities

fun main(){

    var phone = SmartPhone(20.0, 50)

    println("Functions:")
    phone.buyLoad(100.0)
    phone.chargeBattery(1)
    phone.sendText("")


}
class SmartPhone(var load: Double, var batteryPercentage: Int) {
    var amountLoaded: Double = 0.0
    var messagesSent = mutableListOf<String>()
    var currentLoad = (load + amountLoaded) - messagesSent.size.toDouble()

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
//        var messagesSent = mutableListOf<String>()
        println("**********")
        println("Messaging Feature:")
        println("**********")
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
        println("The exercises.getTotal number of messages you sent is/are ${messagesSent.size}")
        println("The your current load is ${currentLoad}.")
       }


}


