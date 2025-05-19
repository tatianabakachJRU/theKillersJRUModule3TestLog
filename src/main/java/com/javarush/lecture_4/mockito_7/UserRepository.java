package com.javarush.lecture_4.mockito_7;

public interface UserRepository {
    void save(User user);
    User findByName(String name);
}
