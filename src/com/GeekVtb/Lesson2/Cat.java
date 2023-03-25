package com.GeekVtb.Lesson2;

public class Cat implements Actions {

    private String name;
    private int jumpDistance;
    private int runDistance;

    public Cat(String name, int jumpDistance, int runDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
    }

    @Override
    public void jump() {
        System.out.println("Cat " +this.name + " is jumping " + this.getJumpDistance());
    }

    @Override
    public void run() {
        System.out.println("Cat " +this.name + " is jumping " + this.getRunDistance());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpDistance() {
        return this.jumpDistance;
    }
}
