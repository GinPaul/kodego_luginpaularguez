package com.oop

class Student(name: String, age: Int): Person(name, age) {
    var studentID: Int = 0

    fun displayStudentId(){
        println(studentID)
    }
    //overriding of function >> place "open" on the superclass function
    override fun displayName(){
        super.displayName()
        println("displaying function displayName from Student class")
    }

    override fun displayAge(){
        super.displayAge()
        println("This is from the student class")
    }
}
//should test the two class are related. use the "is-a" relationship test
//override the function:
//they should have the same function name, the first function should have an "open" before the "fun"
//the new function should have "override"