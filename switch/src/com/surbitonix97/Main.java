package com.surbitonix97;

public class Main {

    public static void main(String[] args) {
        int myValue = 5;

        switch (myValue)
        {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            //u can group the case statements
            case 3: case 4: case 5: case 6:
                System.out.println("value was 3 or 4 or 5 or 6...who knows?");
                System.out.println("the exact value is --> "+myValue);
                break;

            default:
                System.out.println("it was not 1 or 2");
                break;
        }


        char match = 'F';
        switch (match)
        {
            case 'A':
                System.out.println("it's a match --> "+ match);
                break;

            case 'B':
                System.out.println("It's a match --> " + match);
                break;

            case 'C': case 'D': case 'E':
                System.out.println("It's a match --> " + match);
                break;

            default:
                System.out.println("sadly there is no match for your character --> "+match);
                break;
        }

        String monthCheck = "March";
        switch (monthCheck.toLowerCase())
        {
            case "january":
                System.out.println(monthCheck+" is a match!!!");
                break;

            case "february": case "march":
                System.out.println(monthCheck+" is a match");
                break;

            default:
                System.out.println(monthCheck+" is not there");
        }
    }
}
