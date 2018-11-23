package com.z25.decorator;

public class Maine {
    public static void main(String[] args) {
        Developer senior = new SeniorDev(new JavaDeveloper());
        System.out.println(senior.make());
    }
}
