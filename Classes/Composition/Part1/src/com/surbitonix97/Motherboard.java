package com.surbitonix97;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int numRAMSlots;
    private int numCardSlots;
    private String bios;

    public Motherboard (String model, String manufacturer, int numRAMSlots, int numCardSlots, String bios)
    {
        this.model=model;
        this.manufacturer=manufacturer;
        this.numRAMSlots=numRAMSlots;
        this.numCardSlots=numCardSlots;
        this.bios=bios;

    }

    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is loading...");

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumRAMSlots() {
        return numRAMSlots;
    }

    public int getNumCardSlots() {
        return numCardSlots;
    }

    public String getBios() {
        return bios;
    }


}
