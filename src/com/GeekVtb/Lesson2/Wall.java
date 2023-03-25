package com.GeekVtb.Lesson2;

public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean movieng(Actions anction) {
        System.out.println("The wall" + super.getName() + "heigth: " +this.heigth);
        anction.jump();

        if(getHeigth() <= anction.getJumpDistance()) {
            System.out.println("jump success");
            return true;
        }
        else {
            System.out.println("jump unsuccessfully");
            return false;
        }
    }
}
