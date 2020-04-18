public class BankAccountVIP {
    private double creditlimit;
    private String clientName;
    private String clientEmail;
    private String clientPhone;

    public BankAccountVIP()
    {
        this(1.00,"unknown","unknown@banque-privee.ch","00-000-000-0");
        //System.out.println("setting default account");
    }

    public BankAccountVIP(double creditlimit,String clientName)
    {
        this(creditlimit,clientName,"NO NAME","NO PHONE NUMBER");
        //System.out.println("Account created...there are some missing fields.");

    }

    public BankAccountVIP(double creditlimit, String clientName, String clientEmail, String clientPhone)
    {
        //System.out.println("The Account was succesfully created");
        this.creditlimit = creditlimit;
        this.clientEmail = clientEmail;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public String getClientPhone() {
        return clientPhone;
    }
}
