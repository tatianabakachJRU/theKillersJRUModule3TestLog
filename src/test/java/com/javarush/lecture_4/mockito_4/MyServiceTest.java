package com.javarush.lecture_4.mockito_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class MyServiceTest {
    @Test
    public void testWithDoReturn(){
        MyService mock = mock(MyService.class);
        doReturn("Mocked Data").when(mock).fetchData();
        String result = mock.fetchData();
        assertEquals("Mocked Data",result);
    }
}
