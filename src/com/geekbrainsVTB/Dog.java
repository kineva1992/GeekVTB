package com.geekbrainsVTB;

public class Dog extends Animals{

    static int countDog = 0;

    public Dog() {
    countDog++;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    public void Run(int distance) {
        if(distance > 500) {
            System.out.println(name + " не смог пробижать " + distance);
        }
        else
            System.out.println(name + " смог пробижать " + distance);
    }

    @Override
    public void Swim(int distance) {
        if(distance > 10)
            System.out.println(name + " не смог пробижать " + distance);

        else
            System.out.println(name + " смог пробижать " + distance);
    }
}
