package com.javarush.lecture_3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculationOrderingTest {

    private static Calculation calculation;
    @BeforeAll
    public static void beforeAllTests(){
        calculation = new Calculation();
        System.out.println("Start all tests");
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("Start test");
    }


    @Test
    @Order(1)
    public void shouldReturnSumWhenAddingTwoPositiveNumbers(){
        //Calculation calculation = new Calculation();
        int result = calculation.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    @Order(3)
    public void shouldReturnSumWhenAddingOnePositiveOneNegativeNumbers(){
       // Calculation calculation = new Calculation();
        int result = calculation.add(-1, 1);
        assertEquals(0, result);
    }

    @Test
    @Order(2)
    //@Disabled("Тест временно отключен из-за проблем с реализацией")
    public void shouldReturnCorrectDifferenceWhenSubtracting(){
        //Calculation calculation = new Calculation();
        int result = calculation.sub(5, 3);
        assertEquals(2, result);
    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("End test");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("End all tests");
    }
}
