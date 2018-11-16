package com.patern.strategy001;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("strike knife");
    }
}
