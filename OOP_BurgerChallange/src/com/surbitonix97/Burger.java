package com.surbitonix97;

public class Burger {
    private String breadRollType;
    private String meat;
    protected double price;
    private boolean lettuce;
    private boolean friedEgg;
    private boolean onionRing;
    private boolean tomato;
    protected String name;

    public Burger(String breadRollType,String meat, String name){
        this.breadRollType=breadRollType;
        this.meat=meat;
        this.name=name;
    }

    final double lettucePrice = 1.25;
    final double friedEggPrice = 2.75;
    final double onionRingPrice = 2.50;
    final double tomatoPrice = 1.10;
    final double baseBurgerPrice = 5.75;

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setFriedEgg(boolean friedEgg) {
        this.friedEgg = friedEgg;
    }

    public void setOnionRing(boolean onionRing) {
        this.onionRing = onionRing;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public String getBreadRollType(){
        return breadRollType;
    }

    public String getMeat(){
        return meat;
    }

    public double getPrice(){
        return price;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isFriedEgg() {
        return friedEgg;
    }

    public boolean isOnionRing() {
        return onionRing;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void pricing(){
        System.out.println("thanks for ordering "+this.name+"!!!\nYou are so awesome!!!");
        this.price+=baseBurgerPrice;
        System.out.println("Base Price is "+this.price);
        if (isLettuce()){
            this.price+=lettucePrice;
            System.out.println("adding letuce..."+lettucePrice);
        }if (isFriedEgg()){
            this.price+=friedEggPrice;
            System.out.println("adding fried Egg..."+friedEggPrice);
        }if (isOnionRing()){
            this.price+=onionRingPrice;
            System.out.println("adding Onion Ring..."+onionRingPrice);
        }if (isTomato()) {
            this.price += tomatoPrice;
            System.out.println("adding tomato..." + tomatoPrice);
        }

    }


}
