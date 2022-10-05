package com.caseStudy

//this is a subclass of Schedule

open class StudentSched: Schedule(), Stud1stYr1stSem2022, Stud1stYr2ndSem2022 {

    override fun scheduleClass(){
        println("This is from the StudentSched subclass.")
        println("This is to override the function in the Schedule superclass.")
    }

    override fun firstYear1stSem2022StudentSched(){
        println("This is from the StudentSched subclass.")
        println("This is to override the function in the Stud1stYr1stSem2022 interface.")
    }

    override fun firstYear2ndSem2022StudentSched(){
        println("This is from the StudentSched subclass.")
        println("This is to override the function in the Stud2ndYr1stSem2022 interface.")
    }

}