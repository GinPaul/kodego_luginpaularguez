package exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OperationSumAndDivisionTest() {

    @Test
    fun additionOperationTest() {
        var additionChecker = OperationSumAndDivision(10,20)
        assertEquals(30, additionChecker.addition())
    }

    @Test
    fun divisionOperationTest() {
        var divisionChecker = OperationSumAndDivision(10,20)
        divisionChecker.divisor = 5 //this will divide num1 by 5, not num1+num2
        assertEquals(2, divisionChecker.division())
    }
}
//the above operation passed the test!


