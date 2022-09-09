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
    println(strings2)

    //for (char in strings2){print(char)}

    var list = listOf(strings2[0], strings2[1], strings2[2], strings2[3], strings2[4], strings2[5], strings2[6], strings2[7], strings2[8])
        println(list.distinct())


}