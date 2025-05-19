package com.javarush.lecture_4.mockito_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    public void testDoThrow(){
        MyService mock = mock(MyService.class);

        doThrow(new IllegalArgumentException("Invalid input"))
                .when(mock).processDo("throw");

        assertThrows(IllegalArgumentException.class,
                () -> mock.processDo("throw"));
    }

    @Test
    public void testThenThrow(){
        MyService mock = mock(MyService.class);
        when(mock.processThen("throw"))
                .thenThrow(new IllegalArgumentException("Invalid input"));

        assertThrows(IllegalArgumentException.class,
                () -> mock.processThen("throw"));
    }
}
