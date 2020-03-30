package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();


        String choise = "yes";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите математическое выражение: ");
            String mathExp = scan.nextLine();
            String[] a = mathExp.split("\\s", 3);
            calc.setNum1(Integer.parseInt(a[0]));
            calc.setMathOperator(a[1]);
            calc.setNum2(Integer.parseInt(a[2]));
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