import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

//unit testing is per function

class NumberComparatorTest {
    //test cases
    //(1) If 5,3,1 is entered, it will return 5
    @Test //to create a test
    fun fiveThreeOneIsEnteredReturnFIve(){
        var numComparator = NumberComparator()
        assertEquals(5, numComparator.getMaxNumber(5,3,1))
    }
    //(2) If 1,5,2 is entered, it will return 5
    @Test
    fun oneFiveTwoIsEnteredReturnFive(){
        var numComparator = NumberComparator()
        assertEquals(5 , numComparator.getMaxNumber(1,5,2))
    }
    //(3) If 2,5,7 is entered, it will return 7
    @Test
    fun twoFiveSevenIsEnteredReturnSeven(){
        var numComparator = NumberComparator()
        assertEquals(7, numComparator.getMaxNumber(2, 5, 7))
    }
//    //(4) all numbers are the same
//    @Test
//    fun twoFiveSevenIsEnteredReturnSeven(){
//        var numComparator = NumberComparator()
//        assertEquals(2, numComparator.getMaxNumber(2,2,2))
//    }
//    //(5) number1 and number2 are duplicates third number is max value
//
//    //(6) number1 number2 are duplicates third number is mininumum value
//
//    //(7) number2 and number3 are duplicates, first number is max valued
//
//    //(8) number2 and number2 are du
//
}

