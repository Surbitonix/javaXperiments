package com.company;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //float
        //double
        //char
        //boolean
        String myStringText = "this is my first string...\n no...not really";
        System.out.println(myStringText);
        String myNewString = myStringText + "\n...and some more tests...\n\u00A92019";
        System.out.println(myNewString);
        //numbers as strings...i know it - its treated as a string...
        String numberString = "144.95";
        String numberString001 = "256.29";
        System.out.println(numberString+numberString001);
        //mix string and int
        String randNumber = "20";
        int num001 = 5789 ;
        randNumber = randNumber + num001;
        System.out.println(randNumber);



    }
}
