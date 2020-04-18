package com.surbitonix97;

public class PC {
    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard){
        this.theCase=theCase;
        this.monitors=monitors;
        this.motherboard=motherboard;
    }


    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows 10");
        System.out.println("PC Manufacturer is "+ motherboard.getManufacturer());
        System.out.println("PC BIOS is " + motherboard.getBios() + " Model " + motherboard.getModel());
        System.out.println("This PC has " + motherboard.getNumCardSlots() + " card slots");
        System.out.println("This PC has " + motherboard.getNumRAMSlots() + " RAM card slots");
    }

    private void drawLogo(){
        //do some graphics magic here...
        monitors.drawPixelAt(1200,50,"purple");


    }

}
