package com.surbitonix97;

public class Dog extends Animal {

    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eating");

    }

    @Override
    public void breath() {
        System.out.println(getName()+" inhale");
        System.out.println(getName()+" exhale");

    }
}
