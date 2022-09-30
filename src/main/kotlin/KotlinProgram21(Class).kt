fun main() {
    //calling of created class (aka instantation)
    //type your class in uppercase because it is already a class

    var myObject = MyClass("Hello World")

    //var myObject2 = MyClass("hi World!")

    var myGenericobject = MyGenericClass(true)

}
//Generic
class MyGenericClass<T>(variableName:T){
    init{
        println(variableName.toString().length)}
}


class MyClass(variableName: String) {
    init {
        println(variableName)
    }
//creation of Class should be outside the curly brace



}



/*
Class -> used in creating objects (an entity in programming that can hold a variable and functions). Usually displayed in uppercase
         >> variables only holds data
         >> functions are processes

Examples of Class:
     String
     Int
     Double

To create class,
   "class MyClass(value: String)"


 */