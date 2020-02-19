public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int i = -6;
        while(i <= 6) {
            System.out.println(i);
            i = i + 2;
        }

        int i = 12;
        int result = 10;
        do {
            result = result + i;
            i = i + 2;
       } while(i <= 20);
       System.out.println(result);
    }
}