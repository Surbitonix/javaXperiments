package com.surbitonix97;

public class Main {

    public static void main(String[] args) {
        int sumOfNumbers = 0;
        int counter = 0;
        for (int i=1;i<=1000;i++){
            if (i % 3 == 0 || i % 5 == 0){
                counter++;
                System.out.println("number " + (i) +" is a multiple of 3 or 5");
                sumOfNumbers += i;
                if (counter >= 5){
                    System.out.println("TOTAL IS --> "+(sumOfNumbers));
                    break;
                }
            }
        }
    }
}
