package com.surbitonix97;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Player player1 = new Player();
        player1.name = "John";
        player1.weapon = "sword";
        player1.health = 20;

        int x = 5;
        player1.looseHealth(x);
        System.out.println(player1.name + " Remaining health is " + player1.healthRemaining());

        x = 5;
        player1.looseHealth(x);
        System.out.println(player1.name + " Remaining health is " + player1.healthRemaining());

        player1.health=200;
        x = 15;
        player1.looseHealth(x);
        System.out.println(player1.name + " Remaining health is " + player1.healthRemaining());*/

        /*EnhancedPlayer player1 = new EnhancedPlayer("Tim",150,"pencil");
        System.out.println(player1.remainingHealth());*/

        Printer printer001 = new Printer(50,10);
        printer001.printingPages(10,false);
        printer001.printingPages(50,true);
        printer001.fillToner(20);

        printer001.printingPages(50,false);
        printer001.printingPages(40,true);
        printer001.fillToner(80);


    }
}
