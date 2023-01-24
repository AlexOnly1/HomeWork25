package com.ua.sasha;

import java.util.Scanner;

public class SalaryCalc {
    private static final String NEW_SALARY = "Зарплата сотрудника: ";
    private static final String YEARS = "Стаж работы";
    public static final String CURR_SALARY = "Текущая зарплата";
    public void calcSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(YEARS);
        double years = scanner.nextDouble();
        System.out.println(CURR_SALARY);
        double currSalary = scanner.nextDouble();
        double newSalary = 0;

        if(years < 1) {
            newSalary = currSalary;
        } else if (years >= 1 && years < 3) {
            newSalary = currSalary * 0.1 + currSalary;
        } else {
            newSalary = currSalary * 0.2 + currSalary;
        }

        if (newSalary < 4000) {
            newSalary = newSalary + 1000;
        } else {
            newSalary = newSalary + 500;
        }
        System.out.println(NEW_SALARY + newSalary);

    }
}
