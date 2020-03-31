package com.startjava.lesson_4.game;

public class Player {

    int[] enteredNum = new int[10];
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    int setNumber(int number) {
        this.number = number;
        return number;
    }
}