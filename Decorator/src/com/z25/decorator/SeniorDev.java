package com.z25.decorator;

public class SeniorDev extends DevDecorator {
    public SeniorDev(JavaDeveloper developer) {
        super(developer);
    }

    @Override
    public String make() {
        return super.make()+"Review";
    }
}
