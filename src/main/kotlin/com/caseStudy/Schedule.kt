package com.caseStudy

//this is a superclass

open class Schedule {
    init{
        println("This is from the Schedule superclass.")
        println("Persons are going to follow their Schedules at school.")
    }

    open fun scheduleClass(){
        println("This is the function in the Schedule superclass.")
    }
}