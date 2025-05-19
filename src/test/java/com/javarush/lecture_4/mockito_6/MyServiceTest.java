package com.javarush.lecture_4.mockito_6;

import com.javarush.lecture_4.mockitp_6.MyService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testMockMethodWithParameters(){
        MyService mock = mock(MyService.class);

        when(mock.process("hello")).thenReturn("Processing hello");
        when(mock.process("cat")).thenReturn("Processing cat");

        String hello = mock.process("hello");
        assertEquals("Processing hello", hello);
        String cat = mock.process("cat");
        assertEquals("Processing cat", cat);

    }

}
