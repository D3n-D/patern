package com.z25.decorator;

public class DevDecorator implements Developer {
    JavaDeveloper developer ;

    public DevDecorator(JavaDeveloper developer) {
        this.developer = developer;
    }

    @Override
    public String make() {
        return developer.make();
    }
}
