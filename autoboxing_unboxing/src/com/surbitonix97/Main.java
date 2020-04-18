package com.surbitonix97;

import java.util.ArrayList;

//this is the case of creating an arraylist of type int.
//int is a primitive type and its not a class...so how can u create an ArrayList<Int> type? - AutoBoxing is the answer!!!
public class Main {

    public static void main(String[] args)
    {
        Integer int001 = new Integer(54);
        Double doubleValue = new Double(12.54);

        ArrayList<Integer> intArraylist = new ArrayList<Integer>();
        intArraylist.add(1234);
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        ArrayList<Integer> myIntArray = new ArrayList<Integer>();
        for (int i = 0; i<=10; i++)
        {
            myIntArray.add(Integer.valueOf(i));
        }

        for (int i = 0; i<=10;i++)
        {
            System.out.println(i + " ---> " + myIntArray.get(i).intValue());
        }

        Integer myIntValue = 56; //Integer.valueof(56): that is what Java compiles for you.
        int myInt = myIntValue; // myInt.intvalue(); - that is what java does

        ArrayList<Double> myDoubleList = new ArrayList<Double>();

        //boxing
        for (double d = 0.0; d <=10.0; d += 0.5)
        {
            myDoubleList.add(Double.valueOf(d));
        }

        //unboxing
        for (int i =0; i < myDoubleList.size(); i++ )
        {
            System.out.println(i+" ---> "+myDoubleList.get(i).doubleValue());
        }


	// write your code here
    }
}
