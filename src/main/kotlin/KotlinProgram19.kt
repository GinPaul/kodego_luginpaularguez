fun main(){

    var myList = listOf(2,5,3,1)  //this is read only

    //get 2nd element index 1
    println(myList[1])

    //display size
    print(myList.size)

    //traverse list
    for(listValue in myList){
        println(listValue)
    }

    //myList[1] = 3 //can't be done because myList is readonly - fixed size and value

    //adding to the list
    var myList2 = mutableListOf<Int>()
    myList2.add(7)
    myList2.add(8)
    myList2.add(9)

    myList2[0] = 10 //changing index 0

    for(myList2Value in myList2){
        println(myList2Value)
    }

}