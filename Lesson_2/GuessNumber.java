import java.util.Scanner;

public class GuessNumber {

    Player player1 = new Player();
    Player player2 = new Player();

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Начнем игру");
        System.out.println("игрок №1, введите свое имя");
        player1.setName(scan.next());
        System.out.println("игрок №2, введите свое имя");
        player2.setName(scan.next());
        int compNum = (int) Math.random()*101;
        System.out.println("Компьютер загадал число от 1 до 100. Какое число загадал компьютер?");
        boolean x = true;
        do {
            System.out.println(player1.getName() + ", Какое число загадал компьютер?");
            player1.setNumber(scan.nextInt());
            if(compNum < player1.getNumber()) {
                System.out.println("Введенное Вами число больше того что загадал компьютер.");
                x = true;
            } else if(compNum > player1.getNumber()) {
                System.out.println("Введенное Вами число меньше того что загадал компьютер.");
                x = true;
            } else if(compNum == player1.getNumber()) {
                System.out.println(player1.getName() + " Вы угадали! Вы выиграли!");
                x = false;
                break;
            }
            System.out.println(player2.getName() + ", Какое число загадал компьютер?");
            player2.setNumber(scan.nextInt());
            if(compNum < player2.getNumber()) {
                System.out.println("Введенное Вами число больше того что загадал компьютер.");
                x = true;
            } else if(compNum > player2.getNumber()) {
                System.out.println("Введенное Вами число меньше того что загадал компьютер.");
                x = true;
            } else if(compNum == player2.getNumber()) {
                System.out.println(player2.getName() + " Вы угадали! Вы выиграли!");
                x = false;
            }
        } while(x == true);
    }
}