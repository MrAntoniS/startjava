import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scan = new Scanner(System.in);
        String choise = "yes";
        while(choise == "yes") {
            System.out.println("Введите первое число: ");
            calc.setNum1(scan.nextInt());
            System.out.println("Введите знак математической операции: ");
            calc.setMathOperator(scan.next());
            System.out.println("Введите второе число: ");
            calc.setNum2(scan.nextInt());
            calc.calculate();
            int x = 0;
            while(x == 0) {
            System.out.println("Хотите продолжить? [yes/no]: ");
                choise = scan.next();
                switch(choise) {
                    case "yes" :
                        choise = "yes";
                        x = 1;
                        break;
                    case "no" :
                        x = 1;
                        System.out.println("Работа завершена.");
                        break;
                    default :
                        x = 0;
                }
            }
        }
    }
}