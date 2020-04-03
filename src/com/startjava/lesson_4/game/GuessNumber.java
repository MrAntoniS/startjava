package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNum;
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNum = (int) Math.random() * 101;
        System.out.println("Компьютер загадал число от 1 до 100. Угадайте это число.");
        System.out.println("У каждого из Вас 10 попыток!");
        int i = 0;
        for(i = 0; i < 10; i++) {
            makeMove(i, player1);
            if(secretNum == player1.getNumber()) {
                winner(i, player1);
                numbersOutput(player1, player2, i);
                break;
            }
            if(i==9) {
                attemptsEnded(player1);
            }
            makeMove(i, player2);
            if(secretNum == player2.getNumber()) {
                winner(i, player2);
                numbersOutput(player1, player2, i);
                break;
            }
            if(i==9) {
                attemptsEnded(player2);
                System.out.println("Игра окончена. Компьютер выиграл!");
                numbersOutput(player1, player2, i);
            }
        }
        arrayZero(player1, player2, i);
    }

    private void makeMove(int i, Player a) {
        numbersInput(i, a);
        numbersCheck(a);
    }

    private  void numbersInput(int i, Player a) {
        System.out.println(a.getName() + ", какое число загадал компьютер? У Вас осталось " + (10-i) + " попыток!");
        int z = a.setNumber(scan.nextInt());
        a.setEnteredNums(z, i);
    }

    private  void numbersCheck( Player a) {
        if (secretNum < a.getNumber()) {
            System.out.println(a.getName() + ", введенное Вами число больше того что загадал компьютер.");
        } else if (secretNum > a.getNumber()) {
            System.out.println(a.getName() + ", введенное Вами число меньше того что загадал компьютер.");
        }
    }

    private void winner(int i, Player a) {
        System.out.println("Игрок " + a.getName() + " угадал число " + a.getNumber() + " с " + (i + 1) + " попытки! Подравляю, Вы выиграли!");
    }

    private  void  attemptsEnded(Player a) {
        System.out.println("У " + a.getName() + " закончились попытки");
    }

    private void numbersOutput(Player a, Player b, int i) {
        a.getEnteredNums(i);
        System.out.println();
        b.getEnteredNums(i);
        System.out.println();
    }

    public void arrayZero(Player a, Player b, int i) {
        System.out.println();
        Arrays.fill(a.getEnteredNums(i),0, i + 1, 0 );
        Arrays.fill(b.getEnteredNums(i),0, i + 1, 0);
        System.out.println();
    }
}



