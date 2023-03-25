package com.geekbrainsVTB;

public class Animals {

    int distance;
    String name;
    static int counter = 0;



    public Animals() {
        counter++;

    }

    public Animals(int swim, int run, int distance, String name) {
        this.name = name;
        this.distance = distance;
        this.name = name;

    }


    public int getDistance() {
        return distance;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Run(int distance) {
        return;
    }

    public void Swim(int distance) {

    }
}
