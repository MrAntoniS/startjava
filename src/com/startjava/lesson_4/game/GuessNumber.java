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
            if(!checkNumber(i, player1)) {
                numbersOutput(player1, i);
                numbersOutput(player2, i);
                break;
            }
            if(i==9) {
                attemptsEnded(player1);
            }
            makeMove(i, player2);
            if(!checkNumber(i, player2)) {
                numbersOutput(player1, i);
                numbersOutput(player2, i);
                break;
            }
            if(i==9) {
                attemptsEnded(player2);
                System.out.println("Игра окончена. Компьютер выиграл!");
                numbersOutput(player1, i);
                numbersOutput(player2, i);
            }
        }
        arrayResetToZero(player1, i);
        arrayResetToZero(player2, i);
    }

    private void makeMove(int i, Player player) {
        inputNumber(i, player);
        checkNumber(i, player);
    }

    private void inputNumber(int i, Player player) {
        System.out.println(player.getName() + ", какое число загадал компьютер? У Вас осталось " + (10-i) + " попыток!");
        int inputNumber = player.setNumber(scan.nextInt());
        player.setEnteredNum(inputNumber, i);
    }

    private boolean checkNumber(int i, Player player) {
        if (secretNum < player.getNumber()) {
            System.out.println(player.getName() + ", введенное Вами число больше того что загадал компьютер.");
            return true;
        } else if (secretNum > player.getNumber()) {
            System.out.println(player.getName() + ", введенное Вами число меньше того что загадал компьютер.");
            return true;
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " с " + (i + 1) + " попытки! Подравляю, Вы выиграли!");
            return false;
        }
    }

    private void attemptsEnded(Player a) {
        System.out.println("У " + a.getName() + " закончились попытки");
    }

    private void numbersOutput(Player player, int i) {
        System.out.println(Arrays.toString(player.getEnteredNums(i)));
    }

    public void arrayResetToZero(Player player, int i) {
        Arrays.fill(player.getEnteredNums(i),0, i, 0);
    }
}



