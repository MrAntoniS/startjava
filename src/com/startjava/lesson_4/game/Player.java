package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] enteredNums = new int[10];

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

    public int[] getEnteredNums(int i) {
        Arrays.toString(Arrays.copyOf(enteredNums, i));
        return enteredNums;
    }

    public void setEnteredNum(int enteredNums, int i) {
        this.enteredNums[i] = enteredNums;
    }
 }
