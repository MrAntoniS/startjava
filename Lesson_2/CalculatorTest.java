import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        calculatorOne.setNum1(scan.nextInt());
        System.out.println("Введите знак математической операции: ");
        calculatorOne.setMathOperator(scan.next());
        System.out.println("Введите второе число: ");
        calculatorOne.setNum2(scan.nextInt());
        calculatorOne.calculate();
        System.out.println("Хотите продолжить? [yes/no]: ");
        calculatorOne.setChoice(scan.next());
        calculatorOne.nextStep();
    }
}