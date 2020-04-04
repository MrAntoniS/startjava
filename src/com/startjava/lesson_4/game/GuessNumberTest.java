package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Начнем игру");
        System.out.print("игрок №1, введите свое имя: ");
        String name1 = scan.next();
        System.out.print("игрок №2, введите свое имя: ");
        String name2 = scan.next();
        GuessNumber game = new GuessNumber(new Player(name1), new Player(name2));
        String choise = "yes";
        do {
            game.start();
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