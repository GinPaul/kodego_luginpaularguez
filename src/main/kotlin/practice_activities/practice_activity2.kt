package practice_activities

fun main(){

    //Enter grades
    println("Enter grade in Math:")
    var gradeMath = readln().toDouble()

    println("Enter grade in English:")
    var gradeEnglish = readln().toDouble()

    println("Enter grade in Filipino:")
    var gradeFilipino = readln().toDouble()

    //computation
    var sumGrade: Double = (gradeMath + gradeEnglish + gradeFilipino)
    var averageGrade : Double = (sumGrade/3)

    println("Average grade is $averageGrade")

}
