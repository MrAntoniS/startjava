package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 4;
        char mathOperator = '^';

        if(mathOperator == '+') {
            System.out.println(num1 + num2);
        } else if(mathOperator == '-') {
            System.out.println(num1 - num2);
        } else if(mathOperator == '*') {
            System.out.println(num1 * num2);
        } else if(mathOperator == '/') {
            System.out.println(num1 / num2);
        } else if(mathOperator == '^') {
            int result = 1;
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            } 
            System.out.println(result);
        } else if(mathOperator == '%') {
            System.out.println(num1 / num2);
        }
    }
}
