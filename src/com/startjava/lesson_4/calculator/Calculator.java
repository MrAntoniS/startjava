package com.startjava.lesson_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private String mathOperator;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void setMathOperator(String mathOperator) {
        this.mathOperator = mathOperator;
    }

    public void calculate() {
        switch(mathOperator) {
            case "+" :
                System.out.println("Результат: " + Math.addExact(num1, num2));
                break;
            case "-" :
                System.out.println("Результат: " + Math.subtractExact(num1,num2));
                break;
            case "*" :
                System.out.println("Результат: " + Math.multiplyExact(num1, num2));
                break;
            case "/" :
                System.out.println("Результат: " + num1/num2);
                break;
            case "^" :
                System.out.println("Результат: " + Math.pow(num1, num2));
                break;
            case "%" :
                System.out.println("Результат: " + Math.IEEEremainder(num1, num2));
                break;
            default :
                System.out.println("Неверный математический знак");
        }
    }
}