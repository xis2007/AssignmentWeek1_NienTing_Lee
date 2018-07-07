package com.justinlee.assignmentweek1_nien_ting_lee;

public class Human {
    private String name;
    public final static int FIRE_BOW = 1;
    public final static int ICE_BOW = 2;

    public enum WeaponType {
        DEFAULT_WEAPON,
        FIRE_WEAPON,
        ICE_WEAPON
    }


    public Human () {

    }

    public void attack() {
        System.out.println("Fist Attack!");
    }
}
