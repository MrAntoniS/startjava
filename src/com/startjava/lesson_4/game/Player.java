package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] enteredNums = new int[11];

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
        Arrays.toString(Arrays.copyOf(enteredNums, i+1));
        for(int k = 0; k < i+1; k++) {
            System.out.print(enteredNums[k] + " ");
        }
        return enteredNums;
    }

    public void setEnteredNums(int enteredNums, int i) {
        this.enteredNums[i] = enteredNums;
    }
 }
