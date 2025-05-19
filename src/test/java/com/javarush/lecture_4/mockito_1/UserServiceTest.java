package com.javarush.lecture_4.mockito_1;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    @Test
    public void testFetchUser(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        String user = userService.fetchUser();
        assertEquals("Real User", user);

    }

    @Test
    public void testFetchUserWithMock(){
        UserRepository userRepositoryMock = mock(UserRepository.class);
        when(userRepositoryMock.getUser()).thenReturn("Mock User");

        UserService userService = new UserService(userRepositoryMock);
        String user = userService.fetchUser();
        assertEquals("Mock User", user);

    }
}
