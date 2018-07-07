package com.justinlee.assignmentweek1_nien_ting_lee;

public class Warrior extends Human {
    private String name;
    private WeaponType weaponType;

    public Warrior() {
        this.name = "";
        this.weaponType = WeaponType.DEFAULT_WEAPON;
    }

    public Warrior (String name) {
        this.name = name;
        this.weaponType = WeaponType.DEFAULT_WEAPON;
    }

    public Warrior (String name, WeaponType weaponType) {
        this.name = name;
        this.weaponType = weaponType;
    }

    @Override
    public void attack() {
        switch (weaponType) {
            case DEFAULT_WEAPON:
                System.out.println("Attacked with Slash!");
                break;
            case FIRE_WEAPON:
                System.out.println("Attacked with Fire Slash!");
                break;
            case ICE_WEAPON:
                System.out.println("Attacked with Ice Slash!");
                break;
            default:
                break;
        }
    }
}
