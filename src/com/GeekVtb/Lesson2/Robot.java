package com.GeekVtb.Lesson2;

public class Robot implements Actions {


    private String name;
    private int runDistance;
    private int jumpDistance;

    public Robot(String name, int runDistance, int jumpDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void jump() {
        System.out.println("Robot " +this.name + " is jumping " + this.getJumpDistance());
    }

    @Override
    public void run() {
        System.out.println("Robot " +this.name + " is jumping " + this.getRunDistance());
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
