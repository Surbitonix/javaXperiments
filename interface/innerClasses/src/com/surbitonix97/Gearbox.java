package com.surbitonix97;

import java.util.ArrayList;

//its kinda broken....

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIn;

    public Gearbox(int maxGears)
    {
        this.maxGears=maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in)
    {
        this.clutchIn= in;
    }



    public ArrayList<Gear> addGear(int gearNumber, double ratio)
    {
        if (gearNumber==0 && gearNumber<=maxGears)
        {
           this.gears.add(new Gear(gearNumber,ratio));

        }
        return this.gears;
    }

    public void printGears()
    {
        for (int x=0;x<this.gears.size();x++)
        {

            System.out.println(x+" "+this.gears.get(x).gearNumber);

        }
    }

    public void changeGear(int newGear)
    {
        if (newGear>=0 && newGear <= this.gears.size())
        {
            this.currentGear = newGear;
            System.out.println("Gear "+ newGear + " selected");
        }else
            {
                System.out.println("change gear failed");
                this.currentGear = 0;
            }

    }

    public double revSpeed(int revs)
    {
        if (clutchIn)
        {
            System.out.println("change gear!!!");
            return 0.0;
        }
        return revs*gears.get(currentGear).getRatio();

    }



    //create inner class - set it to private so its not accessed from outtside
    private class Gear
    {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio)
        {
            this.gearNumber=gearNumber;
            this.ratio=ratio;
        }

        public double getRatio()
        {
            return ratio;
        }

        public double driveSpeed(int revs)
        {
            return revs*(this.ratio);
        }

    }


}
