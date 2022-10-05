package com.caseStudy

fun main(){

    var person = Person()
    var schedule = Schedule()


    var teacher = Teacher()
    teacher.personClass()
    teacher.fullTimeTeaching()
    teacher.partTimeTeaching()

    var student = Student()
    student.personClass()

    var teacherSchedule = TeacherSched()
    teacherSchedule.scheduleClass()
    teacherSchedule.fullTimeTeacherSched()
    teacherSchedule.partTimeTeacherSched()

    var studentSchedule = StudentSched()
    studentSchedule.scheduleClass()
    studentSchedule.firstYear1stSem2022StudentSched()
    studentSchedule.firstYear2ndSem2022StudentSched()


}
