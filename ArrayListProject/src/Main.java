import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner001 = new Scanner(System.in);
    private static GroceryList myGroceries = new GroceryList();

    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;


        printInstructions();
        while (!quit)
        {
            System.out.print("Enter your choice: ");
            choice = scanner001.nextInt();
            scanner001.nextLine();

            switch (choice)
            {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myGroceries.printGroceryList();
                    break;
                case 2:
                    addItems();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    search4item();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    System.out.println("Exiting\nthanks for using MTronix...");
                    break;
            }
        }
    }

    public static void printInstructions()
    {
        System.out.println("\nPress anywhere to continue...");
        System.out.println("\t0 - Help Menu");
        System.out.println("\t1 - print Groceries list");
        System.out.println("\t2 - Add Items to the list");
        System.out.println("\t3 - Modify item from the list");
        System.out.println("\t4 - Remove Item from the list");
        System.out.println("\t5 - Search for item in the list");
        System.out.println("\t6 - ArrayStuffings");
        System.out.println("\t7 - Exit...");
    }

    public static void addItems()
    {
        System.out.print("Please enter the grocery item: ");
        myGroceries.addGroceryToItem(scanner001.nextLine());
    }

    public static void modifyItem()
    {
        System.out.print("Current Item name: ");
        String itemNumber = scanner001.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner001.nextLine();
        myGroceries.modifyGroceryItem(itemNumber,newItem);

    }

    public static void removeItem()
    {
        System.out.print("Please enter item name:  ");
        String itemNumber = scanner001.nextLine();
        myGroceries.removeGroceryItem(itemNumber);

    }

    public static void search4item()
    {
        System.out.print("Please enter the item you are looking for: ");
        String searchItem = scanner001.nextLine();

        if (myGroceries.onFile(searchItem))
        {
            System.out.print("Item "+searchItem+" is available on the grocery list");
        } else
            {
                System.out.print(searchItem + " is not available on the search list");
            }
    }

    public static void  processArrayList()
    {
        ArrayList<String> newArray = new ArrayList<String>();
        //copy the array
        newArray.addAll(myGroceries.getGroceryList());
        //another way of copying....
        ArrayList<String> Array002 = new ArrayList<String>(myGroceries.getGroceryList());

        //convert back to a normal array
        String[] myArray = new String[myGroceries.getGroceryList().size()];
        myArray = myGroceries.getGroceryList().toArray(myArray);

    }




}
