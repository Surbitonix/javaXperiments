package com.surbitonix97;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myMobile = new MobilePhone();
    public static void main(String[] args) {
        //MobilePhone mobilePhone = new MobilePhone();
        boolean exit = false;
        int choice = 0;

        printIntructions();
        while (!exit)
        {

            System.out.print("yo...sup..enter ur choice -> ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 0:
                    printIntructions();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    System.out.print("Thanks for using surbitonix-tech\nExiting...");
                    exit = true;
                    break;
            }
        }
    }

    private static void printIntructions()
    {
        System.out.println("See below for ur choices ...");
        System.out.println("\t0 - Help Menu");
        System.out.println("\t1 - Print Contact List");
        System.out.println("\t2 - Add Contact");
        System.out.println("\t3 - Modify Contact");
        System.out.println("\t4 - Remove Contact");
        System.out.println("\t5 - Find Contact");
        System.out.println("\t6 - Exit");
    }

    public static void addContact()
    {
        System.out.print("Add new contact plz ");
        myMobile.createContact(scanner.nextLine());

    }
    public static void modifyContact()
    {
        System.out.print("Enter contact name to replace ");
        String currentName = scanner.nextLine();
        System.out.print("Enter new contact name ");
        String newName = scanner.nextLine();
        myMobile.modifyContact(currentName, newName);
    }
    public static void removeContact()
    {
        System.out.print("Enter name to be removed ");
        String contactName = scanner.nextLine();
        myMobile.removeContact(contactName);
    }
    public static void findContact()
    {
        System.out.print("What contact r u looking for? ");
        String conctactName = scanner.nextLine();
        myMobile.findContactInList(conctactName);

    }

    public static void printContactList()
    {
        myMobile.publishContactList();
    }
}
