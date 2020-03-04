import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();

        Scanner k = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        calculatorOne.num1 = k.nextInt();
        System.out.println("Введите знак математической операции: ");
        calculatorOne.mathOperator = k.next();
        System.out.println("Введите второе число: ");
        calculatorOne.num2 = k.nextInt();

        switch(calculatorOne.mathOperator) {
            case "+" :
                calculatorOne.amount();
                break;
            case "-" :
                calculatorOne.subtraction();
                break;
            case "*" :
                calculatorOne.multiplication();
                break;
            case "/" :
                calculatorOne.division();
                break;
            case "^" :
                calculatorOne.exponentiation();
                break;
            case "%" :
                calculatorOne.remainderOfDivision();
                break;
            default :
                System.out.println("Неверный математический знак");
                    }

    }
}