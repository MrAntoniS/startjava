public class Calculator {

    private int num1;
    private int num2;
    private String mathOperator;
    private String choice;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void setMathOperator(String mathOperator) {
        this.mathOperator = mathOperator;
    }

    public String getChoice() {
        return choice;
    }

        void setChoice(String choice) {
        this.choice = choice;
    }

    public void calculate() {
        switch(mathOperator) {
            case "+" :
                System.out.println("Результат: " + (num1 + num2));
                break;
            case "-" :
                System.out.println("Результат: " + (num1 - num2));
                break;
            case "*" :
                System.out.println("Результат: " + (num1 * num2));
                break;
            case "/" :
                System.out.println("Результат: " + (num1 / num2));
                break;
            case "^" :
                int result = 1;
                for(int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                System.out.println("Результат: " + result);
                break;
            case "%" :
                System.out.println("Результат: " + (num1 / num2));
                break;
            default :
                System.out.println("Неверный математический знак");
        }
    }
}