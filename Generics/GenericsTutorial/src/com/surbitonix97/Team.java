package com.surbitonix97;

import java.util.ArrayList;

/*
    look how we create a Generic class...
    T - denotes a parametarized type...i can leave it as Team<T> - but then it will take any object...
    so to be more concise - u need to specify what type of parameters u will take
    and voila Team<T extends Player> - this will take jst Player objects :)
    u can use also multiple bounds - one class followed by interfaces
    Team<T extends  Class & Interface1 & Interface2 >

    we are using a generic interface - comparable! and comparing teams of the same teamType,
    hence Comparable<Team<T>>
 */

public class Team<T extends  Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if (members.contains(player))
        {
            //referencing the other object...I had tried this before...now i can see how it works!
            System.out.println(player.getName()+" is already on the team - "+this.name);
            return false;
        } else
            {
                members.add(player);
                System.out.println(((Player)player).getName()+" picked for team - "+this.name);
                return true;
            }
    }

    //getter for the team size
    public int numberOfPlayers()
    {
        return this.members.size();
    }

    //
    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore)
        {
            won++;
        }
        else if (ourScore == theirScore)
            {
                tied++;
            }
        else if (ourScore < theirScore)
            {
                lost++;
            }
        played++;
        if (opponent!=null)
        {
            opponent.matchResult(null,theirScore,ourScore);
        }

    }

    public int ranking()
    {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking())
        {
            return -1;
        }else if (this.ranking() < team.ranking())
        {
            return 1;
        } else
            {
                return 0;
            }

    }
}
