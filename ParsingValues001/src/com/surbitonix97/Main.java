package com.surbitonix97;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,1,5));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(1,0,6));
        /*String numAsString = "2018.125";
        System.out.println("Number as string is "+ numAsString);
        double n = Double.parseDouble(numAsString);
        System.out.println("number is "+n);

        numAsString+=1;
        n+=1.25d;
        System.out.println(numAsString);
        System.out.println(n);*/
	// write your code here
    }

    public static boolean canPack (int bigCount, int smallCount, int goal)
    {
        int bigSize = 5*bigCount;
        int smallSize = 1*smallCount;
        int total = bigSize + smallSize;
        boolean sizeCheck;

        if ( bigSize < 0 || smallSize < 0) {
            return false;
        }

        if (total == goal){
            sizeCheck = true;
        }
        else if (total > goal && bigSize > goal)
        {
            sizeCheck = false;
        }
        else if (total > goal && bigSize < goal && smallSize > goal)
        {
            sizeCheck = true;
        }

        else
            {
                sizeCheck = false;
            }

        return sizeCheck;

    }
}
