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
        for (i = 0; i < 10; i++) {
            if (!makeMove(i, player1)) {
                System.out.println("Игрок " + player2.getName() + " - " + Arrays.toString(player2.getEnteredNums(i - 1)));
                break;
            }
            if (i == 9) {
                attemptsEnded(player1);
            }
            if (!makeMove(i, player2)) {
                System.out.println("Игрок " + player1.getName() + " - " + Arrays.toString(player1.getEnteredNums(i)));
                break;
            }
            if (i == 9) {
                attemptsEnded(player2);
                System.out.println("Игра окончена. Компьютер выиграл!");
                showNumbers(player1, i);
                showNumbers(player2, i);
            }
        }
        clear(player1, i);
        clear(player2, i);
    }

    private boolean makeMove(int i, Player player) {
        inputNumber(i, player);
        return checkNumber(i, player);
    }

    private void inputNumber(int i, Player player) {
        System.out.println(player.getName() + ", какое число загадал компьютер? У Вас осталось " + (10 - i) + " попыток!");
        player.setEnteredNum(scan.nextInt(), i);
    }

    private boolean checkNumber(int i, Player player) {
        if (secretNum < player.getEnteredNum(i)) {
            System.out.println(player.getName() + ", введенное Вами число больше того что загадал компьютер.");
        } else if (secretNum > player.getEnteredNum(i)) {
            System.out.println(player.getName() + ", введенное Вами число меньше того что загадал компьютер.");
        } else if (secretNum == player.getEnteredNum(i)) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getEnteredNum(i) + " с " + (i + 1) + " попытки! Подравляю, Вы выиграли!");
            showNumbers(player, i);
            return false;
        }
        return true;
    }

    private void attemptsEnded(Player player) {
        System.out.println("У " + player.getName() + " закончились попытки");
    }

    private void showNumbers(Player player, int i) {
        System.out.println("Игрок " + player.getName() + " - " + Arrays.toString(player.getEnteredNums(i)));
    }

    private void clear(Player player, int i) {
        if (i < 9) {
            Arrays.fill(player.getEnteredNums(i), 0, i + 1, 0);
        } else {
            Arrays.fill(player.getEnteredNums(i), 0);
        }
    }
}



