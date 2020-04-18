package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOverAndDontTryAgain = true;
        int score = 10001;
        int levelCompleted = 8;
        int bonus = 200;

        if (score > 5000 && score < 8000){
            System.out.println("Well done ... your score is higher than 5000, but less then 8000\nTry again...");
            }
        else if (score > 10000){
                System.out.println("wow...ur a category of your own....awesome score!!!");
            }
        else {
            System.out.println("Your score...wasnt good enough :(\nTry Again!");
        }

        //to check if TRUE u can jst put the var on its own...JVM interprets it as true
        if (gameOverAndDontTryAgain){
            System.out.println("calculating TOTAL points...");
            int FinalScore = ((score * levelCompleted)+bonus);
            System.out.println("TOTAL IS -> "+FinalScore);

        }
    }
}
