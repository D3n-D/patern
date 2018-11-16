package com.patern.strategy001;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.fight();
        knight.setWeaponBehavior(new AxeBehavior());
        knight.fight();
        knight.setWeaponBehavior(new KnifeBehavior());
        knight.fight();
    }
}
