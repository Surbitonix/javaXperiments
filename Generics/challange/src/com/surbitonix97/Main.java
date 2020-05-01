package com.surbitonix97;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Team<SerieATeam> MilanAC = new Team<>("MilanAC");
        Team<SerieATeam> Juventus = new Team<>("Juventus");
        Team<SerieATeam> Roma = new Team<>("Roma");
        Team<SerieATeam> Sampdoria = new Team<>("Sampdoria");
        Team<SerieATeam> Lazio = new Team<>("Lazio");
        Team<SerieATeam> Brescia = new Team<>("Brescia");


        SerieATeam Grivaldo = new SerieATeam("Grivaldo");
        SerieATeam Jonas = new SerieATeam("Jonas");
        SerieBTeam Manny = new SerieBTeam("Manny");

        MilanAC.addTeamMember(Grivaldo);
        MilanAC.addTeamMember(Jonas);
        //Sampdoria.addTeamMember(Manny);

        MilanAC.playerList();
        Juventus.playerList();
        Roma.playerList();
        Sampdoria.playerList();

        MilanAC.matchResult(Roma,5,0);
        Lazio.matchResult(Sampdoria,2,2);
        Brescia.matchResult(Juventus,0,3);


        MilanAC.matchResult(Sampdoria,5,0);
        Lazio.matchResult(Roma,2,2);
        Brescia.matchResult(Lazio,0,3);

        MilanAC.matchResult(Juventus,1,2);
        Lazio.matchResult(MilanAC,2,2);
        Brescia.matchResult(Sampdoria,4,3);

        Juventus.matchResult(Brescia,3,1);
        Juventus.matchResult(Roma,2,2);


        ArrayList<Team<SerieATeam>> SerieA = new ArrayList<>();
        SerieA.add(MilanAC);
        SerieA.add(Juventus);
        SerieA.add(Roma);
        SerieA.add(Sampdoria);
        SerieA.add(Lazio);
        SerieA.add(Brescia);

        Collections.sort(SerieA,Collections.reverseOrder());

        for (Team t:SerieA)
        {
            System.out.println(t.getTeamName()+" "+t.ranking()+ "\t"+t.win+ " "+t.tie+" "+t.lost);
        }



    }
}
