package com.surbitonix97;

import javax.security.auth.login.AccountException;

public class BankAccount {
    //create the fields
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //create constructor...this makes object initializatoin much easier
    public BankAccount()
    {
        this("000001",0.00,"default name","email@email.com","00-000-0000");
        System.out.println("empty contstructor was called");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Bank account has been successfully created...");
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999",750.00,"Javid Brocholli","test@test.com","054-123-345-6");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //setters and getters
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber()
    {
        return this.number;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;

    }
    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName (String customerName )
    {
        this.customerName = customerName;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    //method to allow deposits
    public void depositFunds(double fundsToDeposit)
    {
        if (fundsToDeposit > 0)
        {
            this.balance+=fundsToDeposit;
            System.out.println("Your funds have been accepted ->" + fundsToDeposit);
            System.out.println("this is your new balance "+ this.balance);
        }
    }

    public void withdrwanFunds(double ammountToWithdraw)
    {
        System.out.println("your balance is "+this.balance+"\nyour withdrawal request is "+ammountToWithdraw );
        if (ammountToWithdraw > this.balance)
        {

            System.out.println("Withdrawal is bigger than the balance...transaction denied");
            System.out.println(this.balance);

        }
        else
            {
                this.balance-=ammountToWithdraw;
                System.out.println("Transaction processed"+"\nthis is your balance "+this.balance);
            }

    }

}
