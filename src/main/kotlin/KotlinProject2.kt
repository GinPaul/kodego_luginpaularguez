fun main (){
    var string1 : String = "this is my String"
    var string2 : String = "this is my String too!"
    //string character - will show what letter is on the 11th space
    println(string1[11])
    //string length - will return how many characters are there
    println(string1.length)
    println(string2.length)
    //string equality - will show if string 1 is equal in value to string 2
    println(string1 == string2)
    //string uppercase/lowercase will convert lowercase to uppercase and vice versa
    println(string2.uppercase())
    //startswith
    println(string2.startsWith(prefix = "the"))
    //endswith
    println(string2.endsWith(suffix = "too!"))
    //concatenate
    println(string1+" "+string2)
    //substring
    println(string1.substring(6,17))
    //replace
    println(string1.replace(oldValue = "this", newValue = "that"))


}