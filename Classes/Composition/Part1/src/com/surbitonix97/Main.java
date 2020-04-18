package com.surbitonix97;

public class Main {

    public static void main(String[] args) {

        Dimensions myDimensions = new Dimensions(20,20,5);
        Case myCase = new Case("220B","Dell","AVC", myDimensions);
        Monitor myMonitor = new Monitor("27 inch Beast","ACER", 27, new Resolution(2540,2440));
        Motherboard myMotherBoard = new Motherboard("B3-2560","ASUS",4,2,"v.22.8");

        PC myPC = new PC(myCase,myMonitor,myMotherBoard);
        myPC.powerUp();

    }
}
