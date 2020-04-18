package com.surbitonix97;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //int[] myIntArray = new int[10];

        //u can assign individually
        /*myIntArray[0] = 41;
        myIntArray[1] = 21;
        myIntArray[5]=50;

        OR ... u can assign in bulk (when u initialize it)
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}
        */
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[7]);
        System.out.println(myIntArray[3]);

        int[] intArray001 = new int[11];
        int multiplier = 9;
        //another way is to use a for loop!
        //use the length field...
        for (int i = 0; i < intArray001.length; i++) {
            intArray001[i] = i * multiplier;
        }
        //and now to print the array
        printArray(intArray001);
    }


    public static void printArray(int[] array) {
        System.out.println("Printing the array");
        for (int x = 1; x < array.length; x++) {
            System.out.println("9" + " x " + x + " = " + array[x]);

        }


    }
}

