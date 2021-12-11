import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

class Debt
{
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate)
    {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance()
    {
        System.out.println("Now the balance is -> " + this.balance);
    }

    public void waitOneYear()
    {
        this.balance = this.balance * this.interestRate;
    }
}

public class Debt
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the balance ->");
        int number = scan.nextInt();

        Debt mortgage = new Debt(number,1.01);
        mortgage.printBalance();
        mortgage.waitOneYear();
        System.out.println("After adding interest rate");
        mortgage.printBalance();

    }
}