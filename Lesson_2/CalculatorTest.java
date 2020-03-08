import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();

        boolean x = true;
        while(x == true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            calculatorOne.setNum1(scan.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculatorOne.setMathOperator(scan.next());
            System.out.println("Введите второе число: ");
            calculatorOne.setNum2(scan.nextInt());
            calculatorOne.calculate();
            boolean y = true;
            while(y == true) {
                System.out.println("Хотите продолжить? [yes/no]: ");
                calculatorOne.setChoice(scan.next());
                switch(calculatorOne.getChoice()) {
                    case "yes" :
                        x = true;
                        y = false;
                        break;
                    case "no" :
                        x = false;
                        y = false;
                        System.out.println("Работа завершена.");
                        break;
                    default :
                        y = true;
                }
            }
        }
    }
}