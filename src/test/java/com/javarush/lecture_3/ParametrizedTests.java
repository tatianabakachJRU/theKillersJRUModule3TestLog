package com.javarush.lecture_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ParametrizedTests {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    public void testWithValueSource(int number) {
        assertEquals(0, number % 2);
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", "test"})
    public void testWithNullSource(String input){
        assertNull(input);
    }

    enum Color {RED, GREEN, WHITE}

    @ParameterizedTest
    @EnumSource(Color.class)
    public void testWithEnumSource(Color color){
        assertNotNull(color);
    }

    static Stream<String> stringProvide(){
        return Stream.of("apple", "banana", "chery");
    }

    @ParameterizedTest
    @MethodSource("stringProvide")
    public void testWithMethodSource(String fruits){
        assertEquals(5, fruits.length());
    }


}
