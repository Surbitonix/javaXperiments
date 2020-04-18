package com.surbitonix97;

import org.w3c.dom.ls.LSOutput;

public class Player {

    public String name;
    public int health = 99;
    public String weapon;



    public void looseHealth(int damage)
    {

        this.health = this.health - damage;

        if (this.health <= 0)
        {
            System.out.println("Player is fucked up");
            //reduce number of lives for the player
        }else
            {
                System.out.println(this.name + " is fine...");
            }
    }

    public int healthRemaining()
    {
        return this.health;
    }
}
