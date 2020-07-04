package com.sda.testingbasics.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeEach
    void setUp() {


    }
    @ParameterizedTest
    @CsvSource({"1,2,3", "2, -3, -1", "-3,5,2", "-1, -3, -4"})

    void thatWeCanAddTwoNumbers(double a, double b, double expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected,calculator.add(a,b), "Sum of " + a + "and" + b + " sould be: " + expected);
    }

    @Test
    @ParameterizedTest
    @CsvSource({"1,2,-1", "2, -3, 5", "-3,5,-8", "-1, -3, 2"})

        void thatWeCanAndNegativeTwoNegativeNumber(double a, double b, double expected) {
            Calculator calculator = new Calculator();

            assertEquals(expected, calculator.subtract(a,b),"Wynik odejmowania liczb" + a + " "+ b + "to " + expected);

        }
        @Test
        void subtractTwoNumbers(){
        Calculator calculator = new Calculator();
        //given
        double a = 4;
        double b = 3;
        //when
        double subtract = a-b;
        //then
            assertEquals(1, subtract,"Wynik odejmowania z  " + a +" "+" " + " "+  b + " "+ subtract );


        }

}
