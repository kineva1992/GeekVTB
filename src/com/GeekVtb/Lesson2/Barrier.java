package com.GeekVtb.Lesson2;


public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract boolean movieng(Actions anction);
    

}
