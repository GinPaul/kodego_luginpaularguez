package com.oop
//Abstraction //encapsulation
open class Person{  //put "open" so that it can be inherited by another class

    var name: String = "John"
    var age: Int = 23
        get() {return field} //optional ito kasi meron na; ilagay man o hindi nandun parin siya
        set(value) { //field - represents the value of the  variable
            field = value //value is what you set
        }

    init{
        println("Object Created!")
        println("Name is $name, age is $age")
    }

    fun upAge():Int{
        age++
        return age
    }

    fun change(age: Int){
        println(age)
    }

    open fun displayName(){
        println("The name is $name")
    }
}