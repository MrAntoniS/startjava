package com.startjava.lesson_4.game;

import java.sql.SQLOutput;
import java.util.Arrays;
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
        int compNum = (int) Math.random() * 101;
        System.out.println("Компьютер загадал число от 1 до 100. Угадайте это число.");
        System.out.println("У каждого из Вас 10 попыток!");
        int i = 0;
        for(i = 0; i < 10; i++) {
            System.out.println(player1.getName() + ", какое число загадал компьютер? У Вас осталось " + (10-i) + " попыток!");
            player1.enteredNum[i] = player1.setNumber(scan.nextInt());
            if (compNum < player1.getNumber()) {
                System.out.println(player1.getName() + ", введенное Вами число больше того что загадал компьютер.");
            } else if (compNum > player1.getNumber()) {
                System.out.println(player1.getName() + ", введенное Вами число меньше того что загадал компьютер.");
            } else if (compNum == player1.getNumber()) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " + (i + 1) + " попытки! Подравляю, Вы выиграли!");
                System.out.println(Arrays.toString(Arrays.copyOf(player1.enteredNum, i+1)));
                System.out.println(Arrays.toString(Arrays.copyOf(player2.enteredNum, i)));
                break;
            }
            if(i==9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            System.out.println(player2.getName() + ", какое число загадал компьютер? У Вас осталось " + (10-i) + " попыток!");
            player2.enteredNum[i] = player2.setNumber(scan.nextInt());
            if(compNum < player2.getNumber()) {
                System.out.println(player2.getName() + ", введенное Вами число больше того что загадал компьютер.");
            } else if(compNum > player2.getNumber()) {
                System.out.println(player2.getName() + ", введенное Вами число меньше того что загадал компьютер.");
            } else if(compNum == player2.getNumber()) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber() + " с " + (i + 1) + " попытки! Подравляю, Вы выиграли!");
                System.out.println(Arrays.toString(Arrays.copyOf(player1.enteredNum, i+1)));
                System.out.println(Arrays.toString(Arrays.copyOf(player2.enteredNum, i+1)));
                break;
            }
            if(i==9) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                System.out.println("Игра окончена. Компьютер выиграл!");
                System.out.println(Arrays.toString(player1.enteredNum));
                System.out.println(Arrays.toString(player2.enteredNum));
            }
        }
        for(i = 0; i < 10; i++) {
            if(i < 9) {
                Arrays.fill(player1.enteredNum, 0, i + 1, 0);
                Arrays.fill(player2.enteredNum, 0, i + 1, 0);
            } else {
                Arrays.fill(player1.enteredNum, 0);
                Arrays.fill(player2.enteredNum, 0);
            }
        }
    }
}