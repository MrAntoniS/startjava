package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String choise = "yes";
        Scanner scan = new Scanner(System.in);
        do {
            scan.nextLine();
            System.out.print("Введите математическое выражение: ");
            String srcMathExpression = scan.nextLine();
            String[] splitMathExpression = srcMathExpression.split("\\s", 3);
            calc.setNum1(Integer.parseInt(splitMathExpression[0]));
            calc.setMathOperator(splitMathExpression[1]);
            calc.setNum2(Integer.parseInt(splitMathExpression[2]));
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