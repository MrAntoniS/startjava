public class Calculator {

        int num1;
        int num2;
        String mathOperator;

        public void amount() {
            System.out.println("Результат: " + (num1 + num2));
    }

        public void subtraction() {
            System.out.println("Результат: " + (num1 - num2));
    }

        public void multiplication() {
            System.out.println("Результат: " + (num1 * num2));
    }

        public void division() {
            System.out.println("Результат: " + (num1 / num2));
    }

        public void exponentiation() {
            int result = 1;
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println("Результат: " + result);
    }

        public void remainderOfDivision() {
            System.out.println("Результат: " + (num1 / num2));
    }


}