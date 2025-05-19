package com.javarush.lecture_5;

import com.javarush.lecture_5.repository.UserRepository;
import com.javarush.lecture_5.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserApp {
    private static final Logger logger = LogManager.getLogger(UserApp.class);

    public static void main(String[] args) {
        logger.info("Starting application");

        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        userService.printAllUsers();
        userService.findAndPrintUser(1);
        userService.findAndPrintUser(100);

        try {
            userService.addNewUser("Anna", "anna@example.com");
            userService.addNewUser("", "invalid-email");
        } catch (RuntimeException e) {
            logger.fatal("Critical error in application", e);
        }

        logger.info("Finished application");
    }
}
