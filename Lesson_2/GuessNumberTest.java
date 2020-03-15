import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumberOne = new GuessNumber();

        Scanner scan = new Scanner(System.in);
        String choise = "yes";
        do {
            guessNumberOne.game();
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