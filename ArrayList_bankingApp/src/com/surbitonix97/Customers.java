package com.surbitonix97;

import java.util.ArrayList;

public class Customers {
    private String customerName;
    private ArrayList<Double> customerTransactions;
    //double initialTransactionAmmount;

    public Customers(String customerName, double initialTransactionAmmount)
    {
        this.customerName=customerName;
        this.customerTransactions = new ArrayList<Double>();
        initialTransaction(initialTransactionAmmount);
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerTransactions(ArrayList<Double> transactions)
    {
        this.customerTransactions = transactions;
    }

    public ArrayList<Double> getCustomerTransactions ()
    {
        return customerTransactions;
    }

    public void initialTransaction(double amount)
    {
        this.customerTransactions.add(amount);
    }










}
