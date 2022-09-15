package practice_activities

fun main(){


    var mobilePhone = MobilePhone("Samsung", "Note20", 2, 6.5, 2)

    var mobile = MobilePhone("Samsung")

    var mobile2 = MobilePhone(6)

}

class MobilePhone(var brand: String, var modelName: String, var age: Int, var screenSize: Double, var simCard: Int) {

    init {
        println("Object Created!")
        println("******************")
        println()
        println("Brand is $brand")
        println("Name of phone is $modelName")
        println("Age from launch year is $age year/s")
        println("Screen Size is $screenSize inches")
        println("Number of Sim Card slots are $simCard")
    }
    //secondary constructor 1

    constructor(brand: String) : this(brand, "Note20", 2, 6.5, 2) {
        println("Object Created!")
        println("******************")
        println()
        println("Brand is $brand")
        println("Name of phone is $modelName")
        println("Age from launch year is $age year/s")
        println("Screen Size is $screenSize inches")
        println("Number of Sim Card slots are $simCard")

    }

    //secondary constructor 2

    constructor(screenSize: Int): this("Samsung", "Note20", 2, 6.5, 2){
        println("Object Created!")
        println("******************")
        println()
        println("Brand is $brand")
        println("Name of phone is $modelName")
        println("Age from launch year is $age year/s")
        println("Screen Size is $screenSize inches")
        println("Number of Sim Card slots are $simCard")
    }


}