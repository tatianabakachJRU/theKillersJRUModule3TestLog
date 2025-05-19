package com.javarush.lecture_4.mockito_1;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String fetchUser(){
        return userRepository.getUser();
    }
}
