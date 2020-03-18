import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber game = new GuessNumber(new Player("Ivan"), new Player("Michael"));

        Scanner scan = new Scanner(System.in);
        String choise = "yes";
        do {
            game.start();
            do {
                System.out.println("Хотите продолжить? [yes/no]: ");
                choise = scan.next();
                switch(choise) {
                    case "yes" :
                        break;
                    case "no" :
                        System.out.println("Работа завершена.");
                        break;
                    default :
                        choise = "something";
                }
            } while(choise.equals("something"));
        } while(choise.equals("yes"));
    }
}