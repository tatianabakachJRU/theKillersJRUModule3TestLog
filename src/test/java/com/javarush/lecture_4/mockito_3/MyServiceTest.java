package com.javarush.lecture_4.mockito_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest {
    @Spy
    private DependencyService dependencyService;
    @InjectMocks
    private MyService myService;

    @Test
    public void testSomeMethod(){
        when(dependencyService.someMethod()).thenReturn("Mocked Value");
        String execute = myService.execute();
        assertEquals("Mocked Value", execute);
    }
}
