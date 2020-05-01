package com.surbitonix97;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderBoard <T extends  Team>{
    private String seriesName;
    private ArrayList<Team> series;

    public LeaderBoard(String leagueName)
    {
        this.seriesName=leagueName;
        series = new ArrayList<>();
    }

    public String getSeriesName()
    {
        return seriesName;
    }

    public boolean addTeam( T teamName)
    {
        if (series.contains(teamName))
        {
            System.out.println(teamName.getTeamName()+ " is already in "+ getSeriesName());
            return false;
        }else
            {
                series.add(teamName);
                System.out.println("added "+teamName.getTeamName()+" to "+getSeriesName());
                return true;
            }
    }

    public void leaderBoard()
    {
        Collections.sort(series,Collections.reverseOrder());
        for (Team t:series)
        {
            System.out.println(t.getTeamName()+" "+t.ranking());
        }
    }

}
