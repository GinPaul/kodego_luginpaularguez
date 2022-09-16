package practice_activities

fun main(){

    //calling the attributes and behavior
    var mobilePhone = MobilePhone("Samsung", "Note20", 2020, 6.5, 2)

    var mobilePhone1 = MobilePhone("Oppo")

    var mobilePhone2 = MobilePhone(10.1)

    println("Features:")
    mobilePhone.sPen()
    mobilePhone.screenWrite()
    mobilePhone.band()
    mobilePhone.allDayBattery()
    mobilePhone.digitalZoom()


}
//class/attributes
class MobilePhone(var brand: String, var modelName: String, var modelYear: Int, var screenSize: Double, var simCard: Int) {

    init {
        println("Object Created!")
        println("******************")
        println()
        println("Brand is $brand.")
        println("Name of phone is $modelName.")
        println("Launched in the year $modelYear.")
        println("Screen Size is $screenSize inches.")
        println("Number of Sim Card slots are $simCard.")
        println()
    }
    //secondary constructor 1
    constructor(brand: String) : this(brand, "Note20", 2020, 6.5, 2) {}

    //secondary constructor 2
    constructor(screenSize: Double): this("Samsung", "Note20", 2020, screenSize, 2){}

    //functions
    //behaviors - Bluetooth S-pen, Screenwrite, 5G band, All-day battery life, digital camera zoom 30x
    fun sPen (){
        println("Bluetooth S-pen can be used as a camera control.")
    }
    fun screenWrite (){
        println("Allows writing on the screen without opening the phone.")
    }
    fun band (){
        println("Browse faster with 5G.")
    }
    fun allDayBattery (){
        println("Longer battery life than can last a day with continued use.")
    }
    fun digitalZoom (){
        println("Zoom in on your object with 30x digital zoom.")
    }
}