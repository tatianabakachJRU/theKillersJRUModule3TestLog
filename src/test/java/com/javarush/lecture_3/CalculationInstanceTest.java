package com.javarush.lecture_3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculationInstanceTest {

    private Calculation calculation;
    @BeforeAll
    public void beforeAllTests(){
        calculation = new Calculation();
        System.out.println("Start all tests");
    }

    @Test
    public void shouldReturnSumWhenAddingTwoPositiveNumbers(){
        //Calculation calculation = new Calculation();
        int result = calculation.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void shouldReturnCorrectDifferenceWhenSubtracting(){
        //Calculation calculation = new Calculation();
        int result = calculation.sub(5, 3);
        assertEquals(2, result);
    }


}
