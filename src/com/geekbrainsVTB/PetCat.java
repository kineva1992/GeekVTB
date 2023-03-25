package com.geekbrainsVTB;

public class PetCat extends Cat{



    public PetCat(String name) {
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
        System.out.println("А домашние коты тем более не могут плавать");
    }
}
