import java.awt.im.spi.InputMethod;
import java.util.Scanner;

public class BankApplication {
    public final int pin = 4356;
    public static long balance = 3000;

    public static void main(String[] args) {

        boolean loop = true;

        System.out.println("please enter your password....");
        Scanner sc = new Scanner(System.in);
        int Ypin = sc.nextInt();
        BankApplication one = new BankApplication();
        if (Ypin == one.pin) {

            while (loop) {
                System.out.println("input your choice");
                System.out.println("1 - credit amount");
                System.out.println("2 - debit amount");
                System.out.println("3 - check balance");
                System.out.println("4 - exit");
                Scanner stc = new Scanner(System.in);
                int choice = stc.nextInt();

                Operations two = new Operations();
                switch (choice) {
                    case 1 -> two.creditAmount();
                    case 2 -> two.debitAmount();
                    case 3 -> two.checkBalance();
                    case 4 -> {
                        System.out.println("Exit successfully...");
                        loop = false;
                    }
                }
            }

        } else {
            System.out.println("enter valid pin...");
        }
    }
}
