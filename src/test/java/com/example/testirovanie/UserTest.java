package com.example.testirovanie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final static  String USER = "USER";
    private final static String USER_EMAIL = "user@mail.ru";
    private final static String SYMBOL = "@";
    private final static String POINT = ".";
    private static User user;

    @BeforeAll
    static void addNewUserWithParameters() {
        user = new User(USER, USER_EMAIL);
        System.out.println(
                "Создание через конструктор с параметрами: " + user.getLogin() + " " + user.getEmail());
    }

    @BeforeAll
    static void addNewUserWithoutParameters() {
        user = new User();
        System.out.println(
                "Создание через конструктор без параметров: " + user.getLogin() + " " + user.getEmail());
    }

    @Test
    void shouldBeCheckedContentSymbols() {
        Assertions.assertTrue(user.getEmail().contains(SYMBOL));
        Assertions.assertTrue(user.getEmail().contains(POINT));
    }

    @Test
    void shouldNameNotEqualsEmail() {
        Assertions.assertEquals(user.getLogin(), user.getEmail());
    }
}