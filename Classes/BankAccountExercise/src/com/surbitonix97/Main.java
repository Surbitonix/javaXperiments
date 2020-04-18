package com.surbitonix97;



public class Main {

    public static void main(String[] args) {


        BankAccount platinum = new BankAccount("12356",2500.00,"Bobby Brownladd","boby@bobby.com","087-789-789");
        System.out.println(platinum.getCustomerName());
        System.out.println(platinum.getNumber());
        System.out.println(platinum.getPhoneNumber());
        System.out.println(platinum.getBalance());
        System.out.println(platinum.getEmail());


        platinum.depositFunds(1200);
        platinum.withdrwanFunds(1200);

        BankAccount JohnAccount = new BankAccount("99999",750.00,"John Travolta", "jt@jt.com","074-123-234-5");
        System.out.println("Johns Accont name is -> "+JohnAccount.getCustomerName()+"\nJohn'sAccount Number is "+
                JohnAccount.getNumber()+"\nJOhn's accont email is "+JohnAccount.getEmail()+"\nJohn's account balance is "+JohnAccount.getBalance());

	// write your code here
    }
}
