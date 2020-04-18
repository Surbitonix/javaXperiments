package com.surbitonix97;

class Car{
    private String name;
    private int cylinder;
    private boolean hasEngine = true;
    private int wheels = 4;
    private int seats = 4;
    private int doors;
    private int speed = 0;
    private boolean hasGears;
    private int gears;


    public Car (String name, int cylinder, int doors, boolean hasGears )
    {
        this.name=name;
        this.cylinder=cylinder;
        this.doors=doors;
        this.speed=speed;
        if (this.hasGears)
        {
            this.gears=gears;
        }
    }

    public String getName(){
        return name;
    }

    public int getCylinder(){
        return cylinder;
    }

    public boolean isHasEngine(){
        return hasEngine;
    }

    public int getWheels(){
        return wheels;
    }

    public int getSeats(){
        return seats;
    }

    public int getDoors(){
        return doors;
    }
    public int getSpeed() {
        return speed;
    }



    public void startEngine()
    {
        if (this.hasEngine)
        {
            System.out.println("starting engine for ..." + this.name);
        }
    }

    public void accelerate(int velocity, int breakPower)
    {
        this.speed=this.speed+=velocity;
        this.speed=this.speed-=breakPower;
        if (this.speed <= 0)
        {
            this.gears=1;
            System.out.println("car stopped");
        }
        if (this.speed > 0 && this.speed < 10){
            this.gears=1;
        }else if (this.speed > 10 && this.speed < 40){
            this.gears=2;
        }else if (this.speed > 40 && this.speed < 80) {
            this.gears = 3;
        }else if (this.speed > 80 && this.speed < 95) {
            this.gears = 4;
        }else if (this.speed > 95 && this.speed < 120)
        {
            this.gears = 5;
        }else if (this.speed > 120) {
            this.gears = 6;
        }
        System.out.println("speed "+speed);
        System.out.println("gear "+this.gears);
    }

}

class Honda extends Car{
    private int gears = 6;
    //private int speed;
    public Honda(int gears) {
        super("Honda", 4, 5, true);
        this.gears=gears;
        //this.speed=speed;
    }

    @Override
    public void accelerate(int velocity, int breakPower) {
        super.accelerate(velocity, breakPower);
    }

    public void accelerate(int velocity, int breakPower)
    {
        this.speed=this.speed+=velocity;
        this.speed=this.speed-=breakPower;
        if (this.speed <= 0)
        {
            this.gears=1;
            System.out.println("car stopped");
        }
        if (this.speed > 0 && this.speed < 10){
            this.gears=1;
        }else if (this.speed > 10 && this.speed < 40){
            this.gears=2;
        }else if (this.speed > 40 && this.speed < 80) {
            this.gears = 3;
        }else if (this.speed > 80 && this.speed < 95) {
            this.gears = 4;
        }else if (this.speed > 95 && this.speed < 120)
        {
            this.gears = 5;
        }else if (this.speed > 120) {
            this.gears = 6;
        }
        System.out.println("speed "+speed);
        System.out.println("gear "+this.gears);
    }



}

public class Main {

    public static void main(String[] args)
    {
	    Honda myHonda = new Honda(5);
	    myHonda.startEngine();
	    myHonda.accelerate(20,5);
        myHonda.accelerate(80,5);
        myHonda.accelerate(90,0);
    }
}
