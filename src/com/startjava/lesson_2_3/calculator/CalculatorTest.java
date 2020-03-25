package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scan = new Scanner(System.in);
        String choise = "yes";
        do {
            System.out.println("Введите первое число: ");
            calc.setNum1(scan.nextInt());
            System.out.println("Введите знак математической операции: ");
            calc.setMathOperator(scan.next());
            System.out.println("Введите второе число: ");
            calc.setNum2(scan.nextInt());
            calc.calculate();
            do {
                System.out.println("Хотите продолжить? [yes/no]: ");
                choise = scan.next();
                switch(choise) {
                    case "yes" :
                        break;
                    case "no" :
                        System.out.println("Работа завершена.");
                        break;
                    default :
                        choise = "something";
                }
            } while(choise.equals("something"));
        } while(choise.equals("yes"));
    }
}