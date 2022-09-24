package com.oop

class Student(_studentId:Int): Person() {
    var studentID: Int = _studentId

    fun displayStudentId(){
        println(studentID)
    }
    override fun displayName(){
        super.displayName()
        println("displaying function displayName from Student class")
    }
}
//should test the two class are related. use the "is-a" relationship test
//override the function:
//they should have the same function name, the first function should have an "open" before the "fun"
//the new function should have "override"