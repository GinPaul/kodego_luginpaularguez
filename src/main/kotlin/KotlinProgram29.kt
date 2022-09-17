fun main(){

    //empty class (serves as a placeholder for the moment because you expect at some point you will create a Person class
    var p1 = EmptyPerson()
    val name: String = "Jack"
    var age: Int = 12

    var john = Person1()
    println(john.name)
    println(john)  //this is reference variable?


}

//empty class
class EmptyPerson {}

class Person1 {
    var name: String = "John"
    init{
        println("Hello $name")
    }
    fun walk(){
        println("Walking...")
    }
}


//nested class (a class within a class)
class Outer {

    val name  = "Outer"
    fun show() = "the name: $name"

    class Nested {
        val name = "Nested"
        fun show() = "the name: $name"
    }
}

//inner class

class Outer2 {

    val name1 = "Outer2"
    fun show() = "the name: $name1"

    inner class Inner {
        val name2 = "Inner"
        fun show() = "data: $name2 and $name1"

    }

}
//Other classes:
//simple class
//Empty class (usually used as a placeholder that eventually will be used)
//nested class
//inner class
// sealed class
//open class
//abstract class
//data class