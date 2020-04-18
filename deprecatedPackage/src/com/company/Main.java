package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteNumber = 120;
        short myShortNumber = 3200;
        int myInt = 2500;
        long superLong = 50000L + ((myByteNumber+myShortNumber+myInt)*10);
        short shortTotal = (short)(1000 + ((myByteNumber+myShortNumber+myInt)*10));

        System.out.println("the Superlong number: \n" + superLong);
        System.out.println("The SHORT_TOTAL is:\n " + shortTotal);
    }
}
