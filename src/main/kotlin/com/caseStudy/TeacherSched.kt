package com.caseStudy

//this is a subclass of superclass Schedule

open class TeacherSched: Schedule(), TeacherSchedFullTime, TeacherSchedPartTime {

    override fun scheduleClass(){
        println("This is from the TeacherSched subclass.")
        println("This is to override the function in the Schedule superclass.")
    }

    override fun fullTimeTeacherSched() {
        println("This is from the TeacherSched subclass.")
        println("This is to override the function in the TeacherSchedFullTime interface.")
    }

    override fun partTimeTeacherSched() {
        println("This is from the TeacherSched subclass.")
        println("This is to override the function in the TeacherSchedPartTime interface.")
    }
}