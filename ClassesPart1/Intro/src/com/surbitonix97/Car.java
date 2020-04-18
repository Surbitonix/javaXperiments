package com.surbitonix97;

public class Car {

    //create fields (these are variables)
    private int doors;
    private int wheels;
    private String model;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("cayman") || validModel.equals("carrera")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
