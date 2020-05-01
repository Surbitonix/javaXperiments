package com.surbitonix97;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static Button ButtonPrint = new Button("Print");

    public static void main(String[] args) {
	// write your code here

/*        Gearbox ferrari = new Gearbox(8);
        ferrari.addGear(1,7.9);
        ferrari.addGear(2,10.9);
        ferrari.addGear(3,25.9);
        ferrari.addGear(4,40);
        ferrari.addGear(5,59);
        ferrari.addGear(6,75.7);
        ferrari.addGear(7,85.6);

        //ferrari.addGear(1,);

        ferrari.operateClutch(false);
        ferrari.changeGear(1);
        //System.out.println(ferrari.revSpeed(1000));
        ferrari.printGears();

        ferrari.operateClutch(false );
        ferrari.changeGear(9);
        //System.out.println(ferrari.revSpeed(1000));*/

        /*class ClickListener implements Button.OnClickListener{
            public ClickListener()
            {
                System.out.println("I have been clicked");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");

            }


        }
*/
        ButtonPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked");
            }
        });
        listen();

    }

    private static void listen()
    {
        boolean quit=false;
        while(!quit)
        {
            int choice = input.nextInt();
            switch (choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    ButtonPrint.onClick();
            }

        }
    }
}
