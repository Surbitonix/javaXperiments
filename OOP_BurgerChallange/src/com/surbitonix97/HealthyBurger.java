package com.surbitonix97;

public class HealthyBurger extends Burger {
    private boolean veggiePatty;
    private boolean carrots;


    public HealthyBurger(){
        super("Brown Rye Bread","chicken","Healthy Burger");
    }

    final double veggiePattyPrice = 8.75;
    final double carrotsPrice = 0.99;

    public void setVeggiePatty(boolean doUWantVeggiePatty){
        this.veggiePatty=doUWantVeggiePatty;
    }
    public boolean isVeggiePatty(){
        return veggiePatty;
    }

    public void setCarrots(boolean doUwantCarrots){
        this.carrots=doUwantCarrots;
    }
    public boolean isCarrots(){
        return carrots;
    }


    @Override
    public void pricing() {
        super.pricing();
        if (isVeggiePatty()){
            this.price+=veggiePattyPrice;
            System.out.println("replacing basic burger with Veggie Patty");
            System.out.println("adding Veggie Patty..."+veggiePattyPrice);
        }if (isCarrots()){
            this.price+=carrotsPrice;
            System.out.println("adding carrots..."+carrotsPrice);
        }
        System.out.println("total is -> "+this.price);


    }
}
