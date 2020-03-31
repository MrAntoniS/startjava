package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playerGuess(int compNum, int i, int[] newEnteredNum, Player a) {
        Scanner scan = new Scanner(System.in);
        System.out.println(a.getName() + ", какое число загадал компьютер? У Вас осталось " + (10-i) + " попыток!");
        a.setEnteredNum(newEnteredNum);
        newEnteredNum[i] = a.setNumber(scan.nextInt());
        if (compNum < a.getNumber()) {
            System.out.println(a.getName() + ", введенное Вами число больше того что загадал компьютер.");
        } else if (compNum > a.getNumber()) {
            System.out.println(a.getName() + ", введенное Вами число меньше того что загадал компьютер.");
        }
    }

    public void winner(int i, Player a, Player b) {
        System.out.println("Игрок " + a.getName() + " угадал число " + a.getNumber() + " с " + (i + 1) + " попытки! Подравляю, Вы выиграли!");
        System.out.println(Arrays.toString(Arrays.copyOf(b.getEnteredNum(), i+1)));
    }

    public void attemptsEnded(Player a) {
        System.out.println("У " + a.getName() + " закончились попытки");
    }

    public void start() {
        int compNum = (int) Math.random() * 101;
        System.out.println("Компьютер загадал число от 1 до 100. Угадайте это число.");
        System.out.println("У каждого из Вас 10 попыток!");
        int[] newEnteredNum1 = new int[10];
        int[] newEnteredNum2 = new int[10];
        int i = 0;
        for(i = 0; i < 10; i++) {
            playerGuess(compNum, i, newEnteredNum1, player1);
            if (compNum == player1.getNumber()) {
                winner(i, player1, player1);
                System.out.println(Arrays.toString(Arrays.copyOf(player2.getEnteredNum(), i)));
                break;
            }
            if(i==9) {
                attemptsEnded(player1);
            }

            playerGuess(compNum, i, newEnteredNum2, player2);
             if(compNum == player2.getNumber()) {
                 winner(i, player2, player1);
                System.out.println(Arrays.toString(Arrays.copyOf(player2.getEnteredNum(), i+1)));
                break;
            }
            if(i==9) {
                attemptsEnded(player2);
                System.out.println("Игра окончена. Компьютер выиграл!");
                System.out.println(Arrays.toString(player1.getEnteredNum()));
                System.out.println(Arrays.toString(player2.getEnteredNum()));
            }
        }
        for(i = 0; i < 10; i++) {
            if(i < 9) {
                Arrays.fill(player1.getEnteredNum(), 0, i + 1, 0);
                Arrays.fill(player2.getEnteredNum(), 0, i + 1, 0);
            } else {
                Arrays.fill(player1.getEnteredNum(), 0);
                Arrays.fill(player2.getEnteredNum(), 0);
            }
        }
    }
}