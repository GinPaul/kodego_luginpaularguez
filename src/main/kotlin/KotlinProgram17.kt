fun main(){

    var mySet = setOf(3,6,1,1,2,2,2,2,2,2)

    println(mySet.count())

    println()

    println(mySet.sum())
    println()
    println(mySet.average())

    //print all unique data
    for (data in mySet){
        print(data)
    }
    println()

    var setA = setOf(2,5,7,8)
    var setB = setOf(1,3,5,7)

    //union of unique
    println(setA.union(setB))

    //intersect (pagkakaparehas)
    println(setA.intersect(setB))

    //difference
    println(setA.minus(setB))
    println(setB.minus(setA))

    //mutable set (changeable)
    var mySet2 = mutableSetOf<Int>()
    mySet2.add(5)
    mySet2.add(7)
    mySet2.add(8)
    mySet2.add(8) //does not accept duplicate/won't show
    mySet2.remove(8)

    for (data in mySet2){
        println(data)
    }
}