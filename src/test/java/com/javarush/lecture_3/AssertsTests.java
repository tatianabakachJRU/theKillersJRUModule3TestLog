package com.javarush.lecture_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertsTests {
    @Test
    public void shouldNotBeSameObjectInstance(){
        String str1 = "Hello";
        String str2 = "Hello";

        assertNotSame(str1, str2);
    }

    @Test
    public void shouldValidAllConditions(){
        String str = "JUnit";
        assertAll("Validating spring properties",
                () -> assertEquals(5, str.length()),
                () -> assertTrue(str.startsWith("J")),
                () -> assertFalse(str.endsWith("a")));
    }

    @Test
    @DisplayName("Тест для проверки исключения в методе")
    public void shouldThrowIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,
                () -> {
            throw new IllegalArgumentException("Invalid argument");
                });
    }
}
