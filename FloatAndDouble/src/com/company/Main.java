package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here - thx
        float MinFloatValue = Float.MIN_VALUE;
        float MaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min FLOAT Value -> " + MinFloatValue);
        System.out.println("Max FLOAT Value -> " + MaxFloatValue);

        double MinDoubleValue = Double.MIN_VALUE;
        double MaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min DOUBLE Value -> " + MinDoubleValue);
        System.out.println("Max DOUBLE Value -> " + MaxDoubleValue);

        System.out.println("\n");

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println("My values:\n"+"INT -> "+myIntValue+
                "\nFLOAT -> "+myFloatValue+"\nDOUBLE -> "+myDoubleValue);
    }
}
