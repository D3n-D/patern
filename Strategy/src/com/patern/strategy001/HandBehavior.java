package com.patern.strategy001;

public class HandBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("strike hand");
    }
}
