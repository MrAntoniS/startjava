public class Game {
    public static void main(String[] args) {
        int num = 55;// загадать число от 0 до 100
        int compNum = 50; 

        if(num < compNum) {
            System.out.println("Введенное Вами число меньше того что загадал компьютер");
        } else if(num > compNum) {
            System.out.println("Введенное Вами число больше того что загадал компьютер");
        } else if(num == compNum) {
            System.out.println("Вы угадали!");
        }
    }
}