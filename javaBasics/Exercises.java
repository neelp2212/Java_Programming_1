import java .util.Scanner;
import java.nio.file.Paths;


// Exercise 1
class Account {

    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

    public double balance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
// Exercise 2
class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}


public class YourFirstBankTransfer {

    public static void main(String[] args) {
        //Exercise 1 Bank Transfer
        Account mattAccount = new Account("Matthews account", 1000.00);

        Account myAccount = new Account("My account", 0);

        mattAccount.withdrawal(100);

        myAccount.deposit(100);

        System.out.print(mattAccount + " \n " + myAccount);

        // Exercise 2
        ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        ClockHand seconds = new ClockHand(60);

        while (true)
        {
            // 1. Printing the time
            System.out.println(hours + ":" + minutes + ":" + seconds);

            // 2. Advancing the second hand
            seconds.advance();

            // 3. Advancing the other hands when required
            if (seconds.value() == 0) {
                minutes.advance();

                if (minutes.value() == 0) {
                    hours.advance();
                }
            }


    }
}