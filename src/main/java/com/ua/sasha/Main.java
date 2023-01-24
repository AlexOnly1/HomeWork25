package com.ua.sasha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final String INVALID_INPUT = "Вы ввели неверное значение";
    private static final String FIRST_TASK = "1 - Проверка возраста";
    private static final String SECOND_TASK = "2 - Деление без остатка на 2";
    private static final String THIRD_TASK = "3 - Расчет зарплаты";
    private static final String CHOOSE_TASK = "Выбирете задачу";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(CHOOSE_TASK);
        System.out.println(FIRST_TASK);
        System.out.println(SECOND_TASK);
        System.out.println(THIRD_TASK);
        try {
            int taskNumber = input.nextInt();
            chooseTask(taskNumber);
        }catch (InputMismatchException exception){
            System.out.println(INVALID_INPUT);
        }
    }

    private static void chooseTask(int taskNumber) {
        switch (taskNumber){
            case 1: {
                AgeChecker ageChecker = new AgeChecker();
                ageChecker.checkAge();
                break;
            }
            case 2: {
                DivideChecker divideChecker = new DivideChecker();
                divideChecker.checkDivide();
                break;
            }
            case 3: {
                SalaryCalc salaryCalc = new SalaryCalc();
                salaryCalc.calcSalary();
                break;
            }
        }
    }
}
