package com.surbitonix97;

import java.util.ArrayList;

public class Branches {
    private String branchName;
    private ArrayList<Customers> customerList;

    public Branches(String branchName)
    {
        this.branchName=branchName;
        this.customerList= new ArrayList<Customers>();
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName()
    {
        return branchName;
    }

    public static Branches createBranch(String name)
    {
        return new Branches(name);
    }

    public boolean addCustomer(Customers name, double intialDeposit)
    {
        if (customerCheck(name)>=0)
        {
            System.out.println("Customer "+name+" already exists");
            return false;

        }else
            {
                this.customerList.add(name);
                System.out.println(name+" was added...");
                name.initialTransaction(intialDeposit);
                System.out.println(intialDeposit + " was added on " + name + " account");
                return true;
            }
    }

    public ArrayList<Double> addTransaction (Customers customerName, ArrayList<Double> transaction)
    {
        if (customerCheck(customerName)>=0)
        {
            System.out.println("Adding deposit of "+transaction+" USD");
            customerName.setCustomerTransactions(transaction);
            return transaction;
        } else
            {
                System.out.println("Customer does not exist"+"Transaction declined ");
                return null;
            }
    }

    //private methods below to find and validate customer
    private int customerCheck(Customers customers)
    {
        return this.customerList.indexOf(customers);
    }

    private boolean customerCheck(String clientName)
    {
        for (int i=0; i<this.customerList.size();i++)
        {
            Customers customers = this.customerList.get(i);
            if (customers.getCustomerName().equals(clientName))
            {
                return true;
            }
        }
        return false;
    }





}
