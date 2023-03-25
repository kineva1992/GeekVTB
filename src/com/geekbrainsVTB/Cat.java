package com.geekbrainsVTB;

public class Cat extends Animals {

    static int countCat = 0;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    @Override
    public void Run(int distance) {
        if(distance > 200) {
            System.out.println(name + " не смог пробижать " + distance);
        }
        else
            System.out.println(name + " смог пробижать " + distance);
    }

    @Override
    public void Swim(int distance) {

        System.out.println("Коты не могу плавать");

    }


}
