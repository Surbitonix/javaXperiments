package com.surbitonix97;

public class Main {
    public static void printDayOfTheWeek(int day)
    {
        switch (day)
        {
            case 1:
                System.out.println("hey ... its Sunday");
                break;
            case 2:
                System.out.println("hey...its Monday");
                break;
            case 3:
                System.out.println("hey...its Tuesday");
                break;
            case 4:
                System.out.println("hey...its Wednesday");
                break;
            case 5:
                System.out.println("hey...its Thursday");
                break;
            case 6:
                System.out.println("hey...its Friday");
                break;
            case 7:
                System.out.println("End of week...SATURDAY!!!");
                break;
            default:
                System.out.println("that is not a valid day");
                break;
        }

    }

    public static void main(String[] args) {
        printDayOfTheWeek(5);
        printDayOfTheWeek(-1);
        printDayoftheWeekv2(5);
        printDayoftheWeekv2(-1);
    }
    private static void printDayoftheWeekv2(int day)
    {
        if  (day < 1 || day > 7)
        {
            System.out.println("Ivalid day");
        }
        else if (day == 1)
        {
            System.out.println("hey...its Sunday");
        }
        else if (day == 2)
        {
            System.out.println("hey...its Monday");
        }
        else if (day == 3)
        {
            System.out.println("hey...its Tuesday");
        }
        else if (day == 4)
        {
            System.out.println("hey...its Wednesdat");
        }
        else if (day == 5)
        {
            System.out.println("hey...its Thursday");
        }
        else if (day == 6)
        {
            System.out.println("hey...its Friday");
        }
        else if (day == 7)
        {
            System.out.println("hey...its Saturday");
        }

    }

}
