package com.surbitonix97;

public class EnhancedPlayer {

    private String name;
    private int hitPoints;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon)
    {
        this.name=name;
        if (health > 0 && health <= 100)
        {
            this.hitPoints =health;
        }else
            {
                System.out.println("health value too high...assigned default value of 99");
                this.hitPoints = 99;
            }
        this.weapon=weapon;
    }

    public void looseHealth(int damage)
    {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints < 0)
        {
            System.out.println(this.name + " is done\nGAME OVER!!!");
        }

    }

    public int remainingHealth()
    {
        return this.hitPoints;
    }
}
