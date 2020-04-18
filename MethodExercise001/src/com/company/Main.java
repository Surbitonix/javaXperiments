package com.company;

public class Main {

    public static void main(String[] args) {
        int PlayerScore = calculateHighScorePosition(200);
        displayHigScorePosition("Jonny", PlayerScore);

        PlayerScore = calculateHighScorePosition(750);
        displayHigScorePosition("MannyKilla",PlayerScore);

        PlayerScore = calculateHighScorePosition(250);
        displayHigScorePosition("King Von",PlayerScore);

        PlayerScore = calculateHighScorePosition(7500);
        displayHigScorePosition("Free T-Kay",PlayerScore);

    }
    public static void displayHigScorePosition(String playerName, int position){
        System.out.println("Welcome player: "+playerName);
        System.out.println("this is your position on the score table: "+position);

    }
    public static int calculateHighScorePosition(int score){
 /*       if (score >= 1000) {
             return  1;
        //u dont need to change check the second condition the score < 1000 cos its always true
        //hover over to check it out
        }else if (score >500 && score < 1000){
            return 2;
        }else if (score > 100 && score < 500) {
            return 3;
        }else {
            return 4;
        }*/
        int position = 4; //this is sort of the default value, as in the lowest value possible
        if (score > 1000){
            position = 1;
        }else if (score >= 500){
            position = 2;
        }else if (score >=100){
            position = 3;
        }
        return position;

    }
}


