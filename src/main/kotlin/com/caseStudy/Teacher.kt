package com.caseStudy

//this is a subclass of Person

open class Teacher: Person(), TeacherFullTime, TeacherPartTime {

    override fun personClass() {
        println("This is to override the function in the Person superclass.")
    }

    override fun fullTimeTeaching() {
        println("This is to override the function in TeacherFullTime interface.")
    }

    override fun partTimeTeaching() {
        println("This is to override the function in TeacherPartTime interface.")
    }
}