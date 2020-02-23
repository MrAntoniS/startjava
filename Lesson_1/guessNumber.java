public class guessNumber {
    public static void main(String[] args) {
        int myNum = 50;// значение игрока
        int compNum = 50;// число от 0 до 100, которое загадал компьютер

        if(myNum < compNum) {
            System.out.println("Введенное Вами число меньше того что загадал компьютер");
        } else if(myNum > compNum) {
            System.out.println("Введенное Вами число больше того что загадал компьютер");
        } else if(myNum == compNum) {
            System.out.println("Вы угадали!" + "Вы выиграли!");
        }
    }
}