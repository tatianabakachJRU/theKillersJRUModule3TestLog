package com.javarush.lecture_4.mockito_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest {
    @Mock
    private DependencyService dependencyService;

    @Test
    public void testSomeMethod(){
        when(dependencyService.someMethod()).thenReturn("Mocked Value");
        MyService myService = new MyService(dependencyService);
        String execute = myService.execute();
        assertEquals("Mocked Value", execute);
    }
}
