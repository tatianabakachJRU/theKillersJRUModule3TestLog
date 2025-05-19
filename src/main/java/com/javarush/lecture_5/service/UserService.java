package com.javarush.lecture_5.service;

import com.javarush.lecture_5.entity.User;
import com.javarush.lecture_5.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserService {
    private static final Logger logger = LogManager.getLogger(UserService.class);

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        logger.info("User Service Initialize");
    }

    public void printAllUsers(){
        logger.trace("Entering printAllUsers method");
        userRepository.getAllUsers().forEach(user ->
                logger.info("User found: {}", user));
    }

    public void findAndPrintUser(int id){
        logger.debug("Looking for user with id: {}", id);
        User userById = userRepository.getUserById(id);
        if(userById != null){
            logger.info("Found user: {}", userById);
        } else {
            logger.warn("User with id: {} not found", id);
        }
    }

    public void addNewUser(String name, String email){
        try{
            int newId = userRepository.getAllUsers().size() + 1;
            User newUser = new User(newId, name, email);
            userRepository.addUser(newUser);
            logger.info("Successfully adding new user: {}", newUser);
        } catch (RuntimeException e){
            logger.error("Error adding new user {}", e.getMessage());
        }
    }
}
