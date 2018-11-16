package com.patern.strategy001;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("strike Axe");
    }
}
