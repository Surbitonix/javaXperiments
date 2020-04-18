package com.surbitonix97;

import java.util.ArrayList;

public class Customer {
    private String clientName;
    ArrayList<Double> clientTransactions;
    private double intialDeposit;

    public Customer(String clientName, double initalDeposit)
    {
        this.clientName=clientName;
        this.clientTransactions = new ArrayList<Double>();
        this.intialDeposit=initalDeposit;
    }

    public String getClientName()
    {
        return clientName;
    }

    public double getIntialDeposit()
    {
        return intialDeposit;
    }

    public ArrayList<Double> getClientTransactions()
    {
        return clientTransactions;
    }

    public static Customer createNewClient(String clientName, double initialDeposit)
    {
        return new Customer(clientName,initialDeposit);
    }

    public void addTransaction(double transaction)
    {
        this.clientTransactions.add(transaction);
    }


}
