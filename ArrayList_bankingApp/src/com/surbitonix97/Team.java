package com.surbitonix97;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> myPlayers;

    public Team(String teamName)
    {
        this.teamName=teamName;
        this.myPlayers = new ArrayList<Player>();
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void addUser(Player player)
    {

        myPlayers.add(player);
    }

    public void printTeamPlayers()
    {
        for (int i=0; i<myPlayers.size();i++)
        {
            System.out.println((i+1)+".Name -> "+this.myPlayers.get(i).getName()+ "||Age -> "+this.myPlayers.get(i).getAge());
        }
    }




}
