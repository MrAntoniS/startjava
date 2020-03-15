import java.util.Scanner;

public class GuessNumber {

    Player player1 = new Player(5);
    Player player2 = new Player(10);

    public void game() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Начнем игру");
        System.out.println("игрок №1, введите свое имя");
        player1.setName(scan.next());
        System.out.println("игрок №2, введите свое имя");
        player2.setName(scan.next());
        int i = (int) Math.random()*101;
        System.out.println("Компьютер загадал число от 1 до 100. Какое число загадал компьютер?");
        int x = player1.getNumber();
        int y = player2.getNumber();
        do {
            if(i < x) {
                System.out.println(player1.getName() + ": " + x + " - Ваше число больше того что загадал компьютер.");
                x--;
            } else if(i > x) {
                System.out.println(player1.getName() + ": " + x + " - Ваше число меньше того что загадал компьютер.");
                x++;
            } else if(i == x) {
                System.out.println(player1.getName() + ": " + x + " - Вы угадали! Вы выиграли!");
                 y = i;
                break;
            }
            if(i < y) {
                System.out.println(player2.getName() + ": " + y + " - Ваше число больше того что загадал компьютер.");
                y--;
            } else if(i > y) {
                System.out.println(player2.getName() + ": " + y + " - Ваше число меньше того что загадал компьютер.");
                y++;
            } else if(i == y) {
                System.out.println(player2.getName() + ": " + y + " - Вы угадали! Вы выиграли!");
                x = i;
                break;
            }
        } while(x != i || y != i);
    }
}