package com.surbitonix97;

public class Player {

    private String name;
    private int age;

    public Player(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public static Player createPlayer(String name, int age)
    {
        return new Player(name,age);
    }


}
