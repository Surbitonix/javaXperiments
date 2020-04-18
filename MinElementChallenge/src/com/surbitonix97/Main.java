package com.surbitonix97;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        findMin(readIntegers(5));

    }

    public static int[] readIntegers(int count){
        System.out.println("Setting up a new array");
        System.out.println("Please enter the new values\r");
        int[] array001 = new int[count];
        for (int i=0; i<array001.length;i++ ){
            array001[i]=myScanner.nextInt();
        }
        return array001;
    }

    public static void findMin(int[] array){
        Arrays.sort(array);
        System.out.println("smallest element is -> "+array[0]);

        }

    }



