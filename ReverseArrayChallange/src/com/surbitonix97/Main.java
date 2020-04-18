package com.surbitonix97;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[] arrayTest = new int[]{4,5,2,7,89,78,77};
        System.out.println(Arrays.toString(arrayTest));
        reverse(arrayTest);
    }

    public static void reverse(int[] arrayToReverse){
        for (int i=0;i<arrayToReverse.length/2;i++)
        {
            int tempValue = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[arrayToReverse.length -i -1];
            arrayToReverse[arrayToReverse.length -i -1]=tempValue;
        }
        System.out.println(Arrays.toString(arrayToReverse));
    }
}
