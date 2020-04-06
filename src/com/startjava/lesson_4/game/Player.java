package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNum(int enteredNums, int i) {
        this.enteredNums[i] = enteredNums;
    }

    public int getEnteredNum(int i) {
        return enteredNums[i];
    }

    public int[] getEnteredNums(int i) {
        return Arrays.copyOf(enteredNums, i+1);
    }
}
