package com.ua.sasha;

import java.util.Scanner;


public class AgeChecker {
    private static final String WELCOME_MESSAGE = "Введите возраст";
    private static final String WRONG_AGE = "Неверный возраст";
    private static final String YOUNG_AGE = "Вы еще не совершеннолетний";
    private static final String ADULT_AGE = "Вы стали взрослым";


    public void checkAge() {
        Scanner input = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
            int age = input.nextInt();
            if (age < 0) {
                System.out.println(WRONG_AGE);
            } else if (age >= 0 && age < 18) {
                System.out.println(YOUNG_AGE);
            } else {
                System.out.println(ADULT_AGE);
            }
    }
}
