package com.javarush.lecture_4.mockito_7;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user){
        userRepository.save(user);
    }

    public User getUser(String name){
        return userRepository.findByName(name);
    }
}
