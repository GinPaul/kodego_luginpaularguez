fun main() {
    //implicit declartion
    //array size = 3
   var names = arrayOf("John", "Paul", "Mark")
    println(names[1])


    //explicit declaration note: index starts with count 0
    var numbers = arrayOf<Int>(1, 2, 3, 5, 6, 7, 8, 9, 10)
    println(numbers[8])

    //array size
    println(numbers.size)

}