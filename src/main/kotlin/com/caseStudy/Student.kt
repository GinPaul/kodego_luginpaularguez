package com.caseStudy

//this is a subclass of Person

open class Student: Person(), StudentF2F, StudentOnline {

    override fun personClass(){
        println("This is to override the function in Person superclass.")
    }

    override fun studentFaceToFace(){

    }

    override fun studentOnline(){

    }
}