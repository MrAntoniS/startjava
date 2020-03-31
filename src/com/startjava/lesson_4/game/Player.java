package com.startjava.lesson_4.game;

public class Player {

    private int[] enteredNum;
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

    public int[] getEnteredNum() {
        return enteredNum;
    }

    public void setEnteredNum(int[] enteredNum) {
        this.enteredNum = enteredNum;
    }
}