public class Main {

    public static void main(String[] args) {
        BankAccountVIP client1 = new BankAccountVIP();
        System.out.println(client1.getClientEmail());
        System.out.println(client1.getClientName());
        System.out.println(client1.getClientPhone());
        System.out.println(client1.getCreditlimit());
        System.out.println(client1.getClass());
        System.out.println("\n*******************************\n");

        BankAccountVIP client2 = new BankAccountVIP(1500000,"David Letterman","david.letterman@bank-privat-monaco.mn","+41-00-000-01");
        System.out.println("client name is "+client2.getClientName());
        System.out.println("client credit limit is "+client2.getCreditlimit());
        System.out.println("client email is "+client2.getClientEmail());
        System.out.println("client phone is "+client2.getClientPhone());

        System.out.println("\n*******************************\n");

        BankAccountVIP client3 = new BankAccountVIP();
        BankAccountVIP client4 = new BankAccountVIP(1000,"John Travisco");
        System.out.println(client3.getCreditlimit());
        System.out.println(client4.getClientPhone());
    }


}
