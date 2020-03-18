import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Начнем игру");
        System.out.println("игрок №1: " + player1.getName());
        System.out.println("игрок №2: " + player2.getName());
        int compNum = (int) Math.random() * 101;
        System.out.println("Компьютер загадал число от 1 до 100. Какое число загадал компьютер?");
        boolean wrongNumber = true;
        do {
            System.out.println(player1.getName() + ", Какое число загадал компьютер?");
            player1.setNumber(scan.nextInt());
            if(compNum < player1.getNumber()) {
                System.out.println("Введенное Вами число больше того что загадал компьютер.");
                wrongNumber = true;
            } else if(compNum > player1.getNumber()) {
                System.out.println("Введенное Вами число меньше того что загадал компьютер.");
                wrongNumber = true;
            } else if(compNum == player1.getNumber()) {
                System.out.println(player1.getName() + " Вы угадали! Вы выиграли!");
                break;
            }
            System.out.println(player2.getName() + ", Какое число загадал компьютер?");
            player2.setNumber(scan.nextInt());
            if(compNum < player2.getNumber()) {
                System.out.println("Введенное Вами число больше того что загадал компьютер.");
                wrongNumber = true;
            } else if(compNum > player2.getNumber()) {
                System.out.println("Введенное Вами число меньше того что загадал компьютер.");
                wrongNumber = true;
            } else if(compNum == player2.getNumber()) {
                System.out.println(player2.getName() + " Вы угадали! Вы выиграли!");
                break;
            }
        } while(true);
    }
}