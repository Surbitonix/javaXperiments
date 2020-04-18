package com.surbitonix97;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int max = 0;
	    int min = 0;

	    while (true)
	    {

            System.out.println("Enter a number: ");
            boolean numCheck = scanner.hasNextInt();
            int number = scanner.nextInt();

            if (numCheck)
            {
                if (number > max)
                {
                    max = number;
                }
                if (number <= min || number < max)
                {
                    min = number;
                }
            } else
                {
                    System.out.println("ERROR - Failed input validation...\nExiting....");
                    break;
                }


            System.out.println("max is --> "+max+"\nmin in --> "+min);
        }
    }
}
