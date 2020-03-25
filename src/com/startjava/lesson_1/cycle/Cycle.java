package com.startjava.lesson_1.cycle;

public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int k = -6;
        while(k <= 6) {
            System.out.println(k);
            k += 2;
        }

        int z = 13;
        int sumOdd = 11;
        do {
            sumOdd = sumOdd + z;
            z += 2;
        } while(z <= 20);
       System.out.println(sumOdd);
    }
}