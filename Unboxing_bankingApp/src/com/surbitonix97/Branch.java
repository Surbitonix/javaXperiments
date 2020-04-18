package com.surbitonix97;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> myCustomer;
    //private Customer customer;

    public Branch (String branchName)
    {
        this.branchName=branchName;
        this.myCustomer = new ArrayList<Customer>();

    }

    public String getBranchName()
    {
        return branchName;
    }

    public ArrayList<Customer> getMyCustomer()
    {
        return myCustomer;
    }

    public boolean addCustomer(String clientName, double initialDeposit)
    {
        if (findCustomer(clientName))
        {
            //Customer Newcustomer = Customer.createNewClient(clientName,initialDeposit);
            this.myCustomer.add(Customer.createNewClient(clientName,initialDeposit));
            System.out.println(clientName+" successfully created"+"\nInitial Deposit -> $"+initialDeposit);
            return true;
        } else
            {
                System.out.println("TRANSACTION DECLINED - customer "+clientName+" already exists");
                return false;
            }

    }

    public double addTransaction(String clientName, double transaction)
    {
        Customer existingCustomer = checkExistingCustomer(clientName);
        if (existingCustomer != null)
        {
            existingCustomer.addTransaction(transaction);
            System.out.println("TRANSACTION COMPLETED"+
                    "\nAmmount - $"+transaction+
                    "\nClient "+clientName);
            return transaction;
        }else
            {
                System.out.println("TRANSACTION DECLINED\n"+clientName+ " - not a VALID client");
                return -1.0;
            }

    }

    public void printCustomerList()
    {
        System.out.println("CLIENT LIST");
        for (int i=0;i<this.myCustomer.size();i++)
        {
            System.out.print("Client Name - "+ myCustomer.get(i).getClientName()+
                                "\nClient Initial Deposit - $"+ myCustomer.get(i).getIntialDeposit()+
                                "\nTransactions - $"+myCustomer.get(i).getClientTransactions()+"\n");
        }
    }

    //CREATE A NEW BRANCH
    public static Branch createBranch(String branchName)
    {
        return new Branch(branchName);
    }

    //PRIVATE METHODS
    private boolean findCustomer(String clientName)
    {
        for (int i=0;i<myCustomer.size();i++)
        {
            Customer customer = this.myCustomer.get(i);
            if (customer.getClientName().equals(clientName))
            {
                return false;
            }
        }
        return true;
    }

    //another find method with Customer class
    private Customer checkExistingCustomer(String customerName)
    {
        for (int x=0;x<this.myCustomer.size();x++)
        {
            Customer checkCustomer = this.myCustomer.get(x);
            if (checkCustomer.getClientName().equals(customerName))
            {
                /*System.out.println("running private Customer checkExistingCustomer(String customerName) " +
                        "\ncheckCustomer is "+checkCustomer);*/
                return checkCustomer;
            }
        }
        return null;
    }

}
