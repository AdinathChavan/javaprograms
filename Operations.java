import java.util.Scanner;

public class Operations {

    public void creditAmount(){
        Scanner sc = new Scanner(System.in);
        BankApplication one = new BankApplication();
        System.out.println("enter amount to add....");
        long amount = sc.nextLong();
        BankApplication.balance+=amount;
        System.out.println("amount added successfully...");

    }
    public void debitAmount(){
        Scanner sc = new Scanner(System.in);
        BankApplication one = new BankApplication();
        System.out.println("enter amount to debit...");
        long amount = sc.nextLong();
        BankApplication.balance-=amount;
        System.out.println("amount debited successfully...");

    }
    public void checkBalance(){
        BankApplication one = new BankApplication();
        System.out.println("Current balance is "+BankApplication.balance);

    }


}
