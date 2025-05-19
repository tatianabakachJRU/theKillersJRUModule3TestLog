package com.javarush.lecture_5.repository;

import com.javarush.lecture_5.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final Logger logger = LogManager.getLogger(UserRepository.class);

    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1, "Alice", "alice@example.com"));
        users.add(new User(2, "Bob", "bob@example.com"));
        logger.info("User repository initialize {} users", users.size());
    }

    public List<User> getAllUsers(){
        logger.trace("Getting all users");
        return new ArrayList<>(users);
    }

    public User getUserById(int id){
        logger.debug("Getting user by id: {}", id);
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addUser(User user){
        logger.info("Adding user: {}", user);
        users.add(user);
    }
}
