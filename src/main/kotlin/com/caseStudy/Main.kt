package com.caseStudy

fun main(){

    var person = Person()
    var schedule = Schedule()
    println()


    var teacher = Teacher()
    teacher.personClass()
    teacher.fullTimeTeaching()
    teacher.partTimeTeaching()
    println()

    var student = Student()
    student.personClass()
    student.studentFaceToFace()
    student.studentOnline()
    println()

    var teacherSchedule = TeacherSched()
    teacherSchedule.scheduleClass()
    teacherSchedule.fullTimeTeacherSched()
    teacherSchedule.partTimeTeacherSched()
    println()

    var studentSchedule = StudentSched()
    studentSchedule.scheduleClass()
    studentSchedule.firstYear1stSem2022StudentSched()
    studentSchedule.firstYear2ndSem2022StudentSched()
    println()

}
