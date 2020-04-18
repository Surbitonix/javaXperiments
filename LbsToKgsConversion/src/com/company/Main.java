package com.company;

public class Main {

    public static void main(String[] args) {
        //1 LBs is 0.45359237 kgs
        double LbsToKgsConvert = 0.45359237d;
        int myWeightinKgs = 77;
        double myWeightinLBs = (int)(myWeightinKgs)/LbsToKgsConvert;
        System.out.println(myWeightinLBs);


    }
}
