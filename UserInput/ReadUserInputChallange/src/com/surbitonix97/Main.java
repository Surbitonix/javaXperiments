package com.surbitonix97;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double total = 0;

        while (counter <= 10)
        {
            System.out.println("Enter number #"+counter);
            boolean numCheck = scanner.hasNextDouble();

            if (numCheck)
            {
                double n = scanner.nextDouble();
                counter++;
                total+=n;
                //System.out.println("number is :"+n+"\ntotal is: "+total);
            }
            else
                {
                    System.out.println("input not valid...try again.");
                }
            scanner.nextLine();
        }

        System.out.println("TOTAL IS -> "+ total);
        scanner.close();
    }
}
