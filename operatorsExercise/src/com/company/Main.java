package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x = 20.00d;
        double y = 80.00d;
        double totalMultiply = (x + y)*100d;
        System.out.println("Total is "+totalMultiply);
        double leftOver = totalMultiply % 40.00d;
        System.out.println("Remainer divided by 40 is "+ leftOver);

        boolean checkLeftOver = (leftOver == 0) ? true : false;
        System.out.println(checkLeftOver);
        //System.out.println(leftOver);
        if (!checkLeftOver){
            System.out.println("There are left over items...please check again");
        }


    }
}
