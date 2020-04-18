package com.surbitonix97;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue="+myIntValue);
        System.out.println("anotherIntValue="+anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue="+myIntValue);
        System.out.println("anotherIntValue="+anotherIntValue);

        //create a new array
        int[] array001 = new int[5];
        int[] array002 = array001;

        System.out.println("array001="+ Arrays.toString(array001));
        System.out.println("array002="+Arrays.toString(array002));

        System.out.println("\nChanging the arrays - to explain how reference types work");
        //change an array
        array002[0]=1;
        System.out.println("After change ... array001="+ Arrays.toString(array001));
        System.out.println("After change ... array002="+Arrays.toString(array002));

        array002 = new int[]{4,5,6,7,8};
        modifyArray(array001);
        System.out.println("After modifier ... array001="+ Arrays.toString(array001));
        System.out.println("After modifier ... array002="+Arrays.toString(array002));


    }

    private static void modifyArray(int[] array){
        array[0]=2;
        array = new int[] {1,2,3,4,5};
    }
}
