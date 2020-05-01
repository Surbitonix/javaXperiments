package com.surbitonix97;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dog myDog = new Dog("Dick");
        myDog.breath();
        myDog.eat();

        Parrot myBird = new Parrot("Rogerlio");
        myBird.breath();
        myBird.eat();
        myBird.fly();

        Penguin myPeng = new Penguin("Emperor");
        myPeng.breath();
        myPeng.fly();
    }
}
