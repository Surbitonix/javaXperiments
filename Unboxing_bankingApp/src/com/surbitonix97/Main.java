package com.surbitonix97;

import java.util.Scanner;

public class Main {

    private static Scanner userInput = new Scanner(System.in);
    //private static Scanner userNumberInput = new Scanner()
    private static Bank mesaVerde = new Bank("Mesa Verde");
    public static void main(String[] args) {


        boolean quit = false;
        int choice = 0;
        helpMenu();


        while(!quit)
        {
            System.out.print("what would you like to do? - ");
            choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice)
            {
                case 0:
                    helpMenu();
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    printFullClientList();
                    break;
                case 5:
                    System.out.println("Thanks for using SurbitronixWorks...\nExiting now...");
                    quit = true;

            }
        }

    }

    public static void helpMenu()
    {
        System.out.println(mesaVerde.getBankName() + "Help Menu\nSee Instructions below");
        System.out.println("\t0 - Help Menu"+
                            "\n\t1 - Add Branch"+
                            "\n\t2 - Add Customer"+
                            "\n\t3 - Add Transaction"+
                            "\n\t4 - Print Client List"+
                            "\n\t5 - Exit");

    }

    public static void addBranch()
    {
        System.out.print("Please enter Branch Name - ");
        String branchName = userInput.nextLine();

        mesaVerde.addBranch(branchName);
    }

    public static void addCustomer()
    {
        System.out.print("Please enter the Branch Name - ");
        String branchName = userInput.nextLine();

        System.out.print("Please Enter client name - ");
        String clientName = userInput.nextLine();

        System.out.print("Please enter the initial deposit - ");
        Double initialDeposit = userInput.nextDouble();

        mesaVerde.addCustomer(branchName,clientName,initialDeposit);
    }

    public static void addTransaction()
    {
        System.out.print("Please enter the branch name - ");
        String branchName = userInput.nextLine();

        System.out.print("Please enter the customer name - ");
        String clientName = userInput.nextLine();

        System.out.print("Please enter the transaction amount - ");
        Double transaction = userInput.nextDouble();

        mesaVerde.addTransaction(branchName,clientName,transaction);
    }

    public static void printFullClientList()
    {
        System.out.print("Enter Branch Name - ");
        String branchName = userInput.nextLine();
        System.out.println("Do you want to see clients transactions? (y/n)");
        String userAnswer = userInput.nextLine();
        boolean showTransaction;
        boolean checkAnswer = true;
        while (checkAnswer)
        {
            if (userAnswer.equalsIgnoreCase("y"))
            {
                showTransaction = true;
                mesaVerde.printClientList(branchName, showTransaction);
                checkAnswer=false;
                break;
            }
            if (userAnswer.equalsIgnoreCase("n") ) {
                showTransaction = false;
                mesaVerde.printClientList(branchName, showTransaction);
                checkAnswer = false;
                break;
            }
                    System.out.println("Input not recognized...");
                    checkAnswer=false;
                    break;

        }



    }
}
