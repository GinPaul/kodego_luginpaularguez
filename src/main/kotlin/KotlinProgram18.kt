fun main(){
    //immutable (mapOF)
    var map = mapOf(1 to "Peter", 2 to "Paul", 3 to "Mary")
    println(map)

    //to become mutable
    var map2 = mutableMapOf<Int, String>()
    map2.put(2, "John") // by doing this, we can add value to the map


    //to get the value of a certain count
    println(map[1])

    //not good to have a null
    println(map[8])

    println(map.get(2))

    //traversing keys
    for (key in map.keys){
        print(key)}

    println()

    //traversing values
    for (value in map.values){
        print(value)}

    //mutable
    var map3 = mutableMapOf<Int,String>()
    map3.put(2, "John")
    map3.remove(key = 2)
    println(map2)
}