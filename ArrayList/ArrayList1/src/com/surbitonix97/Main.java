package com.surbitonix97;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer JohnMalkovich = new Customer("John Malkovich",950.80);
	    Customer customer = JohnMalkovich;
	    customer.setBalance(1028.45);

        System.out.println("Balance for "+ customer.getName() + " is "+ customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        for (int i =0;i < intList.size(); i++)
        {
            System.out.println(i +". "+intList.get(i));
        }

        //adding another element to the array...not a problem for a small list
        intList.add(1,3);
        System.out.println("\n\n");

        for (int i =0;i < intList.size(); i++)
        {
            System.out.println(i +". "+intList.get(i));
        }
    }
}
