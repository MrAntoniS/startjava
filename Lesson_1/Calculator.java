public class Calculator {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 5;
        char symb = '%';
        if(symb == '+') {
            int result = num1 + num2;
            System.out.println(result);
        } else if(symb == '-') {
            int result = num1 - num2;
            System.out.println(result);
        } else if(symb == '*') {
            int result = num1 * num2;
            System.out.println(result);
        } else if(symb == '/') {
            int result = num1 / num2;
            System.out.println(result);
        } else if(symb == '^') {
            int result = 1;
            for(int i = 1; i <= num2; i++) {
                result = result * num1;
            } System.out.println(result);
        } else if(symb == '%') {
            int result = 0;
            for(int i = num2; i <= num1; i += num2) {
                result = num1 - i;
            } System.out.println(result);
        }
    }
}
