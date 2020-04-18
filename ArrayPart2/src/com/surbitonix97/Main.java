package com.surbitonix97;

import java.util.Scanner;

public class Main {

    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInts =  getInts(5);

        System.out.println("values entered were: ");
        for (int i =0;i<myInts.length;i++){
            System.out.println(myInts[i]);
        }

        System.out.println("\nThe average of your array is "+getArrayAverage(myInts));
    }

    public static int[] getInts(int arrayLength){
        System.out.println("Enter "+arrayLength+" values...\r");
        int[] values = new int[arrayLength];

        for (int i=0; i<values.length;i++){
            values[i] = myScanner.nextInt();
        }
        return values;
    }

    public static double getArrayAverage(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum +=array[i];

        }
        System.out.println("total number is "+sum);
        System.out.println("array has "+array.length+" elements");
        return  (double)sum / (double)array.length;
    }
}
