package com.surbitonix97;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
        //System.out.println("10000 at 2 perCent "+calculateInterest(10000,2));

        for (int interest=2; interest < 9;interest++)
        {
            System.out.println("10'0000 with Interest of "+ interest + "% = " + String.format("%.2f",calculateInterest(10000, interest)));
        }

        System.out.println("*******************************************");

        for (int interest=9; interest > 1;interest--)
        {
            System.out.println("10'0000 with Interest of "+ interest + "% = " + String.format("%.2f",calculateInterest(10000, interest)));
        }
        System.out.println("*******************************************");
        System.out.println("*******************************************");
        System.out.println(isPrimeNumber(5));

        int count = 0;
        for (int x=1;x<205;x++){
            if (isPrimeNumber(x)){
                count++;
                System.out.println((x)+" is a prime number" + "\nMatch Number"+ (count));
                //System.out.println(count);
                if (count >= 30){
                    System.out.println("Limit reached...exiting");
                    break;
                }
            }


        }
    }
    public static double calculateInterest(double amount, double interestRate)
    {
        return ( amount * (interestRate / 100));
    }

    //FIND PRIME NUMBER

    public static boolean isPrimeNumber(int n){
        if (n == 1){
            return false;
        }
        for(int i=2; i<= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
