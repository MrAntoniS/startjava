public class GuessNumber {
    public static void main(String[] args) {
        int myNum = 40;// значение игрока
        int compNum = 50;// число от 0 до 100, которое загадал компьютер

        if(myNum < compNum) {
            for(int i = myNum; i <= compNum; i++) {
                if(i < compNum) {
                    System.out.println(i + " Введенное Вами число меньше того что загадал компьютер." + " Компьютер выиграл!");
                } else if(i == compNum) {
                    System.out.println(i + " Вы угадали!" + " Вы выиграли!");
                }
            }
        } else if(myNum > compNum) {
            for(int i = myNum; i >= compNum; i--) {
                if(i > compNum) {
                    System.out.println(i + " Введенное Вами число больше того что загадал компьютер." + " Компьютер выиграл!");
                } else if(i == compNum) {
                    System.out.println(i + " Вы угадали!" + " Вы выиграли!");
                }
            }
        } else if(myNum == compNum) {
            System.out.println(myNum + " Вы угадали!" + " Вы выиграли!");
        }
    }
}