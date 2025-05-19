package com.javarush.lecture_4.mockito_7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class UserServiceTest{
    @Test
    public void testAny(){
        UserRepository mockRepo = mock(UserRepository.class);
        UserService userService = new UserService(mockRepo);
        User nik = new User("Nik");
        userService.createUser(nik);

        verify(mockRepo).save(any(User.class));
    }

    @Test
    @ParameterizedTest
    public void testDoAnswer(){
        UserRepository mockRepo = mock(UserRepository.class);
        UserService userService = new UserService(mockRepo);
        User john = new User("John");
        doAnswer(invocation ->{
            User argument = invocation.getArgument(0);
            assertEquals("John", argument.getName());
            return null;
        }).when(mockRepo).save(any(User.class));
        userService.createUser(john);

        verify(mockRepo).save(any(User.class));
    }
}
