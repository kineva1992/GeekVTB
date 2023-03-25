package com.geekbrainsVTB;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(150,"Barsik");
        Dog dog = new Dog(1000,"Bobik");
        Tiger tiger = new Tiger(150,"Tiger Max");


        tiger.Swim(tiger.getDistance());

        tiger.Run(tiger.getDistance());

        dog.Run(dog.getDistance());

        cat.Run(cat.getDistance());


        System.out.println("-------------------------------");

        List<Animals> animals = new ArrayList<>();
        animals.add(new Cat("Murka"));
        animals.add(new Dog("Bobik"));
        animals.add(new Tiger("Tomas"));
        animals.add(new PetCat("Jorge"));

        for (Animals a : animals) {
            a.Run(100);
            a.Swim(20);
        }


        System.out.println("Класс Amimals вызывался " + Animals.counter + " раз");
        System.out.println("Класс Amimals вызывался " + Cat.countCat + " раз");






    }
}
