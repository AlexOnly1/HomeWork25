package com.ua.sasha;

import java.util.Scanner;

public class DivideChecker {
    private static final String IS_DIVIDED = "Делится";
    private static final String NOT_DIVIDED = "Делтится с остатком: ";
    private static final String ENTER_FIRST_NUMB = "Введите делимое число";
    private static final String ENTER_SECOND_NUMB = "Введите число на которое будете делить";

    public void checkDivide() {
        Scanner input = new Scanner(System.in);
        System.out.println(ENTER_FIRST_NUMB);
        double a = input.nextDouble();
        System.out.println(ENTER_SECOND_NUMB);
        double b = input.nextDouble();
        if (a % b == 0){
            System.out.println(IS_DIVIDED);
        } else {
            double c = a % b;
            System.out.println(NOT_DIVIDED + c);
        }
    }
}
