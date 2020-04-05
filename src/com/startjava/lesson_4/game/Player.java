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

    public int[] getEnteredNums(int i) {
       return Arrays.copyOf(enteredNums, i);
    }

    public void setEnteredNum(int enteredNums, int i) {
        this.enteredNums[i] = enteredNums;
    }
 }
