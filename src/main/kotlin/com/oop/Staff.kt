package com.oop

class Staff: Employee (){
    override fun computeBonus(){
        //no plus
        bonus = bonus

        println("Staff bonus is $bonus.")

    }
}