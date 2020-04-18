package com.surbitonix97;

import java.util.Scanner;

public class Main {

    private static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array001 = setArray(3);
        printArray(array001);
        sortArray(array001);

    }

    public static int[] setArray(int arrayLength){
        System.out.println("setting up the array");
        System.out.println("Please enter any values:\r");
        int[] values = new int[arrayLength];

        for (int i=0; i<arrayLength;i++){
            values[i] = myScanner.nextInt();
            //System.out.println("You entered "+values[i]);
        }
        return values;

    }

    public static void printArray(int[] arrayName){
        System.out.println("printing the array");
        for (int x=0;x<arrayName.length;x++){
            System.out.println(x+". "+arrayName[x]);
        }
    }

    public static void sortArray(int[] arrayToSort){
        System.out.println("Sorting array...");
        //set up a new array with same lenght of the one to copy
        int [] newArray = new int[arrayToSort.length];
        //now copy the array across
        for (int i = 0; i < newArray.length; i++ )
        {
            newArray[i]=arrayToSort[i];
        }

        boolean isSorted = true;
        int placeHolder;
        while (isSorted)
        {
            isSorted =false;
            for (int i=0; i<newArray.length-1;i++)
            {
                if(newArray[i]<newArray[i+1])
                {

                    placeHolder=newArray[i];
                    newArray[i]=newArray[i+1];
                    newArray[i+1]=placeHolder;
                    isSorted = true;

                }
            }
        }

        for (int x = 0; x<newArray.length;x++)
        {
            System.out.println(x+". "+newArray[x]);

        }


    }


    }




