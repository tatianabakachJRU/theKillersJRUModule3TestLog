package com.javarush.lecture_3;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationNestedTest {
    @Nested
    class AdditionTests{
        @Test
        public void shouldReturnSumWhenAddingTwoPositiveNumbers(){
            Calculation calculation = new Calculation();
            int result = calculation.add(2, 3);
            assertEquals(5, result);
        }

        @Test
        public void shouldReturnSumWhenAddingOnePositiveOneNegativeNumbers(){
            Calculation calculation = new Calculation();
            int result = calculation.add(-1, 1);
            assertEquals(0, result);
        }
    }

    @Nested
    class SubtractionTests{
        @Test
        public void shouldReturnCorrectDifferenceWhenSubtracting(){
            Calculation calculation = new Calculation();
            int result = calculation.sub(5, 3);
            assertEquals(2, result);
        }
    }
}
