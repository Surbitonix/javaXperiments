package com.surbitonix97;



import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*// this is ArrayList Raw type

        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        //items.add("going to Zurich");
        items.add(3);
        items.add(4);
        printDouble(items);

    //ArrayList with paramateryzied type
        ArrayList<Integer> newItems = new ArrayList<Integer>();
        newItems.add(1);
        newItems.add(2);
        //items.add("going to Zurich");
        newItems.add(3);
        newItems.add(4);

        newPrintDouble(newItems);*/

        FootballPlayer Tom = new FootballPlayer("Tom");
        BaseballPlayer Pat = new BaseballPlayer("Pat");
        SoccerPlayer Futre = new SoccerPlayer("Futre");

        Team<SoccerPlayer> FCPorto = new Team<>("FCPorto");
        Team<BaseballPlayer> ChicagoCubs = new Team<>("Chicago Cubs");
        Team<FootballPlayer> NewEnglandPatriots = new Team<>("NewEnglandPatriots");

        FCPorto.addPlayer(Futre);
        ChicagoCubs.addPlayer(Pat);
        NewEnglandPatriots.addPlayer(Tom);

        Team<SoccerPlayer> Benfica = new Team<>("Benfica");
        Benfica.addPlayer(Futre);

        System.out.println(FCPorto.numberOfPlayers());

        FCPorto.matchResult(Benfica,5,1);
        System.out.println("Porto wins - "+FCPorto.won);
        System.out.println("DErrotas do Benfica - "+Benfica.lost);
        System.out.println("FC Porto Pontos - "+FCPorto.ranking());
        System.out.println("Benfica Pontos - "+Benfica.ranking());
        System.out.println(FCPorto.compareTo(Benfica));
        System.out.println(Benfica.compareTo(FCPorto));

    }

    private static void printDouble(ArrayList n)
    {
        for (Object i : n)
        {
            System.out.println((Integer) i * 2);
        }
    }

    private static void newPrintDouble(ArrayList<Integer> x)
    {
        for (int i : x)
        {
            System.out.println(i * 2);
        }
    }


}
