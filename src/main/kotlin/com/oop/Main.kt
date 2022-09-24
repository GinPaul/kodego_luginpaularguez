package com.oop

fun main(){
    var joePerson = Person()
    joePerson.name = "Peter"
    println(joePerson.name)
    joePerson.age = -1
    println("Hello World!")
    println()

//   //inheritance from super class Person
//    var joeStudent = Student()
//    println(joeStudent.name)
//    joeStudent.age =-1

    var joeStudent = Student(123456)
    println(joeStudent.name)
    joeStudent.displayName()
    joeStudent.displayStudentId()
}

