package com.startjava.lesson_1.game;

public class GuessNumber {
    public static void main(String[] args) {
        int myNum = 50;// значение игрока
        int compNum = 50;// число от 0 до 100, которое загадал компьютер
        int i = myNum;

        do {
            if(i < compNum) {
                System.out.println(i + " Введенное Вами число меньше того что загадал компьютер." + " Компьютер выиграл!");
                i++;
            } else if(i > compNum) {
                System.out.println(i + " Введенное Вами число больше того что загадал компьютер." + " Компьютер выиграл!");
                i--;
            }
        } while(i != compNum);
        System.out.println(i + " Вы угадали!" + " Вы выиграли!");
    }
}