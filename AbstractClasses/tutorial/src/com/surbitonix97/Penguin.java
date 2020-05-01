package com.surbitonix97;

public class Penguin extends Bird {
    public Penguin(String name)
    {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is a penguin...it doesnt fly...but its a good swimmer");

    }
}
