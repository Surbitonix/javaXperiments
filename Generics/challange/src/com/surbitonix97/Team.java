package com.surbitonix97;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String teamName;
    int win;
    int tie;
    int lost;
    int matchesPlayed;

    private ArrayList<T> teamMembers = new ArrayList<>();


    public Team(String teamName)
    {
        this.teamName=teamName;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public int getTeamMembers()
    {
        return this.teamMembers.size();
    }

    public boolean addTeamMember(T playerName)
    {
        if (teamMembers.contains(playerName))
        {
            System.out.println("driver "+playerName.getPlayerName()+" is already on Scuderia "+this.teamName);
            return false;
        }
        System.out.println("adding team mate "+playerName.getPlayerName()+" to Team " + this.teamName);
        this.teamMembers.add(playerName);
        return true;
    }

    public void playerList()
    {

        for (int i=0;i<this.teamMembers.size();i++)
        {
            System.out.println(this.teamMembers.get(i).getPlayerName() +" - TEAM: "+this.teamName);
        }
    }

    public void matchResult(Team<T> rival, int  ourScore , int theirScore)
    {
        if (ourScore > theirScore)
        {
            //System.out.println(our"");
            win++;
        }else if (ourScore == theirScore){
            tie++;
        } else
            {
                lost++;
            }
        matchesPlayed++;
        if(rival!=null)
        {
            rival.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking()
    {
        return (win * 3)+tie;

    }

    @Override
    public int compareTo(Team<T> t) {
        if (this.ranking() > t.ranking())
        {
            return 1;
        }else if (this.ranking() == t.ranking())
        {
            return 0;
        }else
            {
                return -1;
            }
    }
}
