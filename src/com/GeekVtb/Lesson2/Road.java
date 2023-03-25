package com.GeekVtb.Lesson2;

public class Road extends Barrier {

    private int length;

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean movieng(Actions anction) {
        System.out.println("The road" + super.getName() + " length" + this.length);
        anction.run();

        if(getLength() <= anction.getRunDistance()) {
            System.out.println("Run secces");
            return true;
        }
        else {
            System.out.println("Run unsuccessfully");
            return false;
        }

    }
}
