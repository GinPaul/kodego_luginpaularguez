package com.oop

//Abstraction //encapsulation
open class Person (name: String, age: Int) { //put "open" so that it can be inherited by another class

    var name: String = name
    var age: Int = age

    init {
        println("Object Created")
        println("name is $name, age is $age")
    }

    //1.) overriding
    open fun displayName() {
        println("Name is $name")
    }
    //2.) overloading - same name, different parameters, same class
    fun displayName(name: String){
        println("Name is $name")
    }
    fun  displayName(numberOfTimes: Int){
        var ctr = numberOfTimes -1
        while(ctr >= 0){
            println("Name is $name")
            ctr--
        }
    }
    open fun displayAge(){
        println("Age is $age")
    }
}
//    var name: String = "John"
//    var age: Int = 23
//        get() {return field} //optional ito kasi meron na; ilagay man o hindi nandun parin siya
//        set(value) { //field - represents the value of the  variable
//            field = value //value is what you set
//        }
//
//    init{
//        println("Object Created!")
//        println("Name is $name, age is $age")
//    }
//
//    fun upAge():Int{
//        age++
//        return age
//    }
//
//    fun change(age: Int){
//        println(age)
//    }
//
//    open fun displayName(){
//        println("The name is $name")
//    }
