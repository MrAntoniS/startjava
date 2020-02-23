public class GuessNumber {
    public static void main(String[] args) {
        int myNum = 15;// значение игрока
        int compNum = 50;// число от 0 до 100, которое загадал компьютер

        if(myNum < compNum) {
            System.out.println("Введенное Вами число меньше того что загадал компьютер." + " Компьютер выиграл!");
        } else if(myNum > compNum) {
            System.out.println("Введенное Вами число больше того что загадал компьютер." + " Компьютер выиграл!");
        } else if(myNum == compNum) {
            System.out.println("Вы угадали!" + " Вы выиграли!");
        }
    }
}