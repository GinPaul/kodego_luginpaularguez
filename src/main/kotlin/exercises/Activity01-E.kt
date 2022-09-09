package practice_activities

import java.nio.charset.Charset
import kotlin.coroutines.CoroutineContext

fun main() {

    var string1: String = ""
    var string2: String = ""

    //type the words
    println("Enter String 1:")
    string1 = readln()

    println("Enter String 2:")
    string2 = readln()

    //combining the words
    //var strings1 = arrayListOf<String>(string1,string2)

    var strings2: String = string1+string2
    println()
    //println(strings2)

    //for (char in strings2){print(char)}

    //var ctr: Int = 0
    //while(ctr < strings2.length){
        //strings2.contains(strings2[ctr])}
        //println(strings2)
    //ctr++

    var list = listOf(strings2[0])
        println(list.distinct())

    //var ctr: String = ""
    //while(ctr < strings2.length.toString()){
        //string2.contains(string1[ctr])
        //println(strings2[ctr])
       // ctr++

    }
    //var list = listOf(string1[ctr]string2[ctr])
        //println(list.distinct())
        //println(list)


    //var mySet = mutableSetOf<String>()
    //mySet.add(string1)
    //mySet.add(string2)
    //println(mySet)

    //for (data in mySet){
        //println(data)
    //}

    //println(mySet.distinct())
