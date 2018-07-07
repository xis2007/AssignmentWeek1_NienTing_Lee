package com.justinlee.assignmentweek1_nien_ting_lee;

public class Mage extends Human {
    private String name;
    private WeaponType weaponType;

    public Mage() {
        this.name = "";
        this.weaponType = WeaponType.DEFAULT_WEAPON;
    }

    public Mage (String name) {
        this.name = name;
        this.weaponType = WeaponType.DEFAULT_WEAPON;
    }

    public Mage (String name, WeaponType weaponType) {
        this.name = name;
        this.weaponType = weaponType;
    }

    @Override
    public void attack() {
        switch (weaponType) {
            case DEFAULT_WEAPON:
                System.out.println("Attacked with Arcane Missiles!");
                break;
            case FIRE_WEAPON:
                System.out.println("Attacked with Fireball!");
                break;
            case ICE_WEAPON:
                System.out.println("Attacked with Frostbolt!");
                break;
            default:
                break;
        }
    }
}
