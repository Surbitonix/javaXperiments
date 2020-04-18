package com.surbitonix97;

public class Main {

    public static void main(String[] args) {
        /*int count = 0;
        while (count <= 5)
        {
            System.out.println("count is --> "+ count);
            count++;
        }

        System.out.println("\n\nANOTER WAY OF LOOPING\n\n");

        count = 1;

            do
            {
                System.out.println("count value is: " + count);
                count++;
            }
            while (count <= 100);*/



        int x = 0;
        int finalx = 40;

        int counter = 0;
        int sumTotal = 0;

        while (x <= finalx)
        {
            x++;
            if (!isEvenNumber(x))
            {
                counter++;
                sumTotal+=x;
                System.out.println(counter + ". "+"Not even number -> " + x);
                System.out.println("Total is -> "+ sumTotal+"\n");


                if (counter == 12)
                {
                    System.out.println(counter+" required Matches reached\nExiting...");
                    break;
                }

            }
            //System.out.println("number check "+ x);
        }
    }

    public static boolean isEvenNumber(int n)
    {
        return (n % 2 == 0);
    }
}

