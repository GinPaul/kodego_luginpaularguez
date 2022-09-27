package com.oop

open class Manager: Employee(){
    override fun computeBonus(){
        //additional 10%
        bonus *= 1.1
        super.computeBonus()
        println("Bonus for Manager is $bonus.")
    }
}