package com.patern.strategy001;

public  abstract class  Character {
    public WeaponBehavior weaponBehavior;

    public Character(){
        weaponBehavior = new HandBehavior();
    }
    public  void fight(){
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
