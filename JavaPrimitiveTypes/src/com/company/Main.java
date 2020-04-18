package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;
        int myMinValue = Integer.MIN_VALUE;
	    int myMaxValue = Integer.MAX_VALUE;

        System.out.println("This is INTEGER minimum value\n"+ myMinValue);
        System.out.println("This is INTEGER maximum value\n" + myMaxValue);
        System.out.println("Buster MAX Value\n" + (myMaxValue+1));

        byte myByteNumber = 120;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My BYTE number is:\n"+myByteNumber);
        System.out.println("The Byte Min value is\n"+myMinByteValue);
        System.out.println("The BYTE MAX value is\n"+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("The SHORT Min value is\n"+myMinShortValue);
        System.out.println("The SHORT MAX value is\n"+myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("The LONG Min value is\n"+myMinLongValue);
        System.out.println("The LONG MAX value is\n"+myMaxLongValue);
        System.out.println(myLongValue);
        Long TestLong = 12312L;
        System.out.println(TestLong);

        //calculations with BYTE
        byte ByteTotal = (byte) (myMinByteValue/2) ;
        System.out.println("Divide min Byte by 2\n"+ByteTotal);

        short myNewShortValue = (short)(myMinShortValue /2) ;
        System.out.println("Divide MinShortValue by 2\n"+myNewShortValue);


    }
}
