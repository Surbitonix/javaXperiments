package com.company;

public class Main {

    public static void main(String[] args) {

        CalculateScore(true,800,8,200);
        CalculateScore(true,10000,10,5000);

    }
    //this method returns something...so instead of void..that retunrns nothing ... im using INT to return an int
    public static int CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            System.out.println("calculating TOTAL points...");
            int FinalScore = ((score * levelCompleted)+bonus);
            System.out.println("TOTAL IS -> "+FinalScore);
            return FinalScore;
        }

        if (score >= 10000){
            System.out.println("\"wow...ur a category of your own....awesome score!!!");
        }
        else if (score > 5000 && score < 9999){
            System.out.println("Well done ... your score is higher than 5000, but less then 10000\nTry again...");
        }
        else {
            System.out.println("you didnt finish the game yet...continue :(\nTry Again!");
        }
        return 0;

    }
}
