package com.surbitonix97;

import java.lang.reflect.Array;
import java.util.ArrayList;


//public class Bank {
 /*   private String bankName;
    private ArrayList<Branches> branches ;

    public Bank(String bankName)
    {
        this.bankName=bankName;
        this.branches = new ArrayList<Branches>();
    }

    public String getBankName()
    {
        return bankName;
    }

    public boolean addBranch(Branches branchName)
    {
        if (checkBranch(branchName.getBranchName())>=0)
        {
            this.branches.add(branchName);
            System.out.println(branchName+ " successfully added");
            return true;
        }else
            {
                System.out.println("Branch "+branchName+" already exists...");
                return false;
            }

    }

    public boolean addCustomer(Customers customerName, String branchName, Double initialDeposit)
    {
        Branches branch = checkBranch(branchName);
        if (branch != null)
        {
            //Customers x = x.setCustomerTransactions(initialDeposit);
            branch.addCustomer(customerName,initialDeposit);
            System.out.println(customerName+ "was added"+"\nBranch "+branchName+"\nInitialDeposit"+initialDeposit);
            return true;
        }else
            {
                return false;
            }
    }

    public void addCustomerTransaction(String branchName, ArrayList<Double> transaction, Customers customerName)
    {
        checkBranch(branchName.);
        if (branch != null)
        {
            branch.addTransaction(customerName,transaction);
            System.out.println(">>>TRANSACTION SUCCESSFULLY COMPLETED<<<"+
                                "Customer Name - "+customerName+
                                "transaction amount - "+transaction);

        }else
            {
                System.out.println("TRANSACTION FAILED...");
            }

        //return transaction;
    }



    private int checkBranch(Branches branchName)
    {
        return this.branches.indexOf(branchName);

    }

    private int checkBranch(String branchName)
    {
        for (int i=0;i<this.branches.size();i++)
        {
            Branches branchToCheck = this.branches.get(i);
            //jst for experimenting im gonna print the output
            System.out.println(i);
            if (branchToCheck.getBranchName().equals(branchName))
            {
                System.out.println(branchToCheck);
                return i;
            }
        }
        return -1;
    }

 }
*/