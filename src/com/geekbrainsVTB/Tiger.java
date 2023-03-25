package com.geekbrainsVTB;

public class Tiger extends Animals{

    static int countTiger = 0;

    public Tiger() {
        countTiger++;
    }

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(int distance, String name) {
        this.distance = distance;
        this.name = name;
    }

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
