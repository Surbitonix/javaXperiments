package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int calc1 = CalculateScore(true,800,8,200);
        System.out.println(calc1);

        int calc2 = CalculateScore(true,10000,10,5000);
        System.out.println(calc2);


    }
    //this method returns something...so instead of void..that retunrns nothing ... im using INT to return an int
    public static int CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            //System.out.println("calculating TOTAL points...");
            int FinalScore = ((score * levelCompleted) + bonus);
            //System.out.println("TOTAL IS -> "+FinalScore);
            return FinalScore;
        }
        return -1;
    }

    }

