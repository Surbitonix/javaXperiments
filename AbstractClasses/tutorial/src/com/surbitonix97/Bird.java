package com.surbitonix97;

public abstract class Bird extends Animal implements  CanFly{
    public Bird(String name)
    {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is pecking...");

    }

    @Override
    public void breath() {
        System.out.println(getName()+" is breathing...in and out...in and out...");

    }

    @Override
    public void fly() {
        System.out.println(getName()+" flapping its wings");

    }
}
