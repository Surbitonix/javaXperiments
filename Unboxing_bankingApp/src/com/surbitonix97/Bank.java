package com.surbitonix97;



import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> myBranch;
    //private Branch branch;

    public Bank(String bankName)
    {
        this.bankName=bankName;
        this.myBranch = new ArrayList<Branch>();


    }

    public String getBankName()
    {
        return bankName;
    }

    public boolean addBranch(String branchName)
    {
        if (!findBranch(branchName))
        {
            Branch branch = Branch.createBranch(branchName);
            this.myBranch.add(branch);
            System.out.println("CONGRATS!!!"+branchName+" has been successfully created!!!");
            return true;
        }else
            {
                System.out.println("ERROR - "+branchName+" already exists...");
                return false;
            }
    }

    public boolean addCustomer(String branchName, String clientName, double initialDeposit)
    {
        Branch branch = checkBranch(branchName);
        if (branch!=null)
        {
            //System.out.println("Client "+clientName+" was created"+"\nfunds deposited - $"+initialDeposit);
            branch.addCustomer(clientName,initialDeposit);
            return true;
        }else
            {
                System.out.println("Branch "+branchName+" does not exist");
                return false;
            }
    }

    public double addTransaction(String branchName, String clientName, double transaction)
    {
        Branch branch = checkBranch(branchName);


        if (checkBranch(branch.getBranchName())!=null)
        {
            branch.addTransaction(clientName,transaction);
            //return true;
        }
        return transaction;

    }

    public void printClientList(String branchName, boolean showtransaction)
    {
        Branch branch = checkBranch(branchName);
        if (branch.getBranchName()!=null)
        {
            ArrayList<Customer> branchCustomers = branch.getMyCustomer();
            System.out.println("BANK - "+this.getBankName());
            System.out.println("BranchName - "+branch.getBranchName());
            System.out.println("Customer List");
            for (int i=0;i<branchCustomers.size();i++)
            {

                System.out.println((i+1)+". "+branchCustomers.get(i).getClientName());
                if (showtransaction)
                {
                    System.out.println("Transactions");
                    System.out.println("Initial Deposit - "+branchCustomers.get(i).getIntialDeposit());
                    System.out.println("Transactions - "+branchCustomers.get(i).getClientTransactions());

                }
            }
        }

    }

    //private methods
    private boolean findBranch(String branchName)
    {
        for (int i=0;i<myBranch.size();i++)
        {
            Branch branchToCheck = this.myBranch.get(i);
            if (branchToCheck.getBranchName().equals(branchName))
            {
                return true;
            }
        }
        return false;
    }

    //private function of Branch class
    private Branch checkBranch(String branchName)
    {
        for (int i=0;i<myBranch.size();i++)
        {
            Branch branchToCheck = this.myBranch.get(i);
            if (branchToCheck.getBranchName().equals(branchName))
            {
                return branchToCheck;
            }
        }
        return null;
    }
}
