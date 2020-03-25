package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.98f, 7, 8, 6);

        System.out.println(jaegerOne.getModelName());
        System.out.println(jaegerOne.getMark());
        System.out.println(jaegerOne.getOrigin());
        System.out.println(jaegerOne.getHeight());
        System.out.println(jaegerOne.getWeight());
        System.out.println(jaegerOne.getSpeed());
        System.out.println(jaegerOne.getStrenght());
        System.out.println(jaegerOne.getArmor());

        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();

        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 9, 8, 6);
        System.out.println("");

        System.out.println(jaegerTwo.getModelName());
        System.out.println(jaegerTwo.getMark());
        System.out.println(jaegerTwo.getOrigin());
        System.out.println(jaegerTwo.getHeight());
        System.out.println(jaegerTwo.getWeight());
        System.out.println(jaegerTwo.getSpeed());
        System.out.println(jaegerTwo.getStrenght());
        System.out.println(jaegerTwo.getArmor());

        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.useVortexCannon();
    }
}