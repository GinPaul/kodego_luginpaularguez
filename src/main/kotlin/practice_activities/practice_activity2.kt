package practice_activities

fun main(){

    //Enter grades
    println("Enter Grade in Math:")
    var gradeMath = readln().toDouble()

    println("Enter Grade in English:")
    var gradeEnglish = readln().toDouble()

    println("Enter Grade in Filipino:")
    var gradeFilipino = readln().toDouble()

    //computation
    var sumGrade: Double = (gradeMath + gradeEnglish + gradeFilipino)
    var averageGrade : Double = (sumGrade/3)

    println("Average Grade is: $averageGrade")

}
