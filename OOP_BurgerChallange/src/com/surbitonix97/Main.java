package com.surbitonix97;

public class Main {

    public static void main(String[] args) {
  /*      Burger myBurger = new Burger("Bread","meatloaf","Basic");
        myBurger.setFriedEgg(true);
        myBurger.setTomato(true);
        myBurger.setLettuce(true);
        myBurger.setOnionRing(false);
        myBurger.pricing();*/

        HealthyBurger burger001 = new HealthyBurger();
        System.out.println("Bread roll type is "+ burger001.getBreadRollType());
        burger001.setVeggiePatty(false);
        burger001.setFriedEgg(true);
        burger001.setLettuce(true);
        burger001.setCarrots(false);
        burger001.pricing();

        System.out.println("\n\n");
        DeluxeBurger burger002 = new DeluxeBurger();
        burger002.setFriedEgg(true);
        burger002.setLettuce(true);
        burger002.pricing();

    }
}
