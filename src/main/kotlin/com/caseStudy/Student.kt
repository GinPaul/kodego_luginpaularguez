package com.caseStudy

//this is a subclass of Person

open class Student: Person() {

    override fun personClass(){
        println("This is to override the function in Person superclass.")
    }
}