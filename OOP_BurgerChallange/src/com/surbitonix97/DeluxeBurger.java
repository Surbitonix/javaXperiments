package com.surbitonix97;

public class DeluxeBurger extends Burger {
    private boolean drinks = true;
    private boolean chips = true;

    public DeluxeBurger(){
        super("Some bread","super delicious meat","DeluxeBurger");

    }

    final double drinksPrice = 2.55;
    final double chipsPrice = 2.00;

    public boolean isDrinks(){
        return drinks;
    }

    public boolean isChips(){
        return chips;
    }

    @Override
    public void pricing() {
        super.pricing();
        //exclude the other additionals
        if (isOnionRing()) {
            System.out.println("WARNING - Onion Ring is not available on this menu." +
                    "\nTry the HealthyBurger or BasicBurger menu to get it!");
            this.price-=onionRingPrice;
        }if (isLettuce()){
            System.out.println("WARNING - Lettuce is not available in this menu "+
                    "\nTry the HealtyBurger or the BasicBurger Menu to get it!");
            this.price-=lettucePrice;
        }if (isFriedEgg()){
            System.out.println("WARNING - Fried Egg is not available on this menu." +
                    "\nTry the HealthyBurger or BasicBurger menu to get it!");
            this.price-=friedEggPrice;
        }if(isTomato()){
            System.out.println("WARNING - Tomato is not available on this menu"+
                    "\n Try the HealtyBurger or the Basic Burger menu to get it!");
            this.price-=tomatoPrice;
        }
        //add drinks
        this.price+=drinksPrice;
        System.out.println("Drinks - "+drinksPrice);
        //add chips
        this.price+=chipsPrice;
        System.out.println("Chips - "+chipsPrice);


        System.out.println("total is -> "+this.price);
    }

}
