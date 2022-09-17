package practice_activities

fun main(){

    var phone = SmartPhone(20.0, 50)

    println("Functions:")
    phone.buyLoad(20.0)
    phone.chargeBattery(51)



}
class SmartPhone(var load: Double, var batteryPercentage: Int) {

    init {
        println("Object Created!")
        println("******************")
        println()
        println("The initial value of your load is $load and batteryPercentage is $batteryPercentage%.")
        println()
    }

    //functions
    fun buyLoad(amountLoaded: Double) {
        if (amountLoaded > 0) {
            var newLoad = load + amountLoaded
            println("Loading succeeded!")
            println("The new load amount is $newLoad.")
            println("**********")
            println()
        }else{
            println()
            println("Invalid Amount!")
            println("Please try again.")
            println("**********")
            println()
        }
    }

    fun chargeBattery(charged: Int){
        var newCharge = batteryPercentage + charged
        if (newCharge <= 100) {
            println("Charging succeeded!")
            println("The current charge is $newCharge%.")
            println("**********")
            println()
        }else{
            println("WARNING: Charging overload!")
            println("Please unplug your phone.")
            println("**********")
            println()
        }
    }

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
}





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
