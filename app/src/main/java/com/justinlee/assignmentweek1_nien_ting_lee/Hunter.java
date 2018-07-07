package com.justinlee.assignmentweek1_nien_ting_lee;

public class Hunter extends Human {
    private String name;
    private WeaponType weaponType;

    public Hunter() {
        this.name = "";
        this.weaponType = WeaponType.DEFAULT_WEAPON;
    }

    public Hunter (String name) {
        this.name = name;
        this.weaponType = WeaponType.DEFAULT_WEAPON;
    }

    public Hunter (String name, WeaponType weaponType) {
        this.name = name;
        this.weaponType = weaponType;
    }

    @Override
    public void attack() {
        switch (weaponType) {
            case DEFAULT_WEAPON:
                System.out.println("Attacked with Arrow!");
                break;
            case FIRE_WEAPON:
                System.out.println("Attacked with Fire Arrow!");
                break;
            case ICE_WEAPON:
                System.out.println("Attacked with Ice Arrow!");
                break;
            default:
                break;
        }
    }
}
