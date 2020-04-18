package com.surbitonix97;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");

        boolean ageCheck = scanner.hasNextInt();

        if (ageCheck)
        {
            int birth = scanner.nextInt();
            scanner.nextLine();//this is so it takes the nxt input request
            int age = 2020 - birth;

            System.out.println("Yo...wats ur name...: ");
            String name = scanner.nextLine();
            if (age >= 0 && age <=200)
            {
                System.out.println("your name is: " + name + "\nYou are: "+ age+" years old.");
            }else
            {
                System.out.println("invalid year of birth\nExiting...");
            }

        }else
            {
                System.out.println("your parameters are not valid");
            }



        scanner.close();
    }
}
