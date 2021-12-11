import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;


class DecreasingCounter
{
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue()
    {
        System.out.println("value: " + this.value);
    }

    public void decrement()
    {
        if (this.value > 0)
        {
            this.value--;
        }
        else
        {
            System.out.println("Sorry your number is a negative integer");
        }

    }

    public void increment()
    {
        if (this.value > 0)
        {
            this.value ++;
        }
        else
        {
            System.out.println("Sorry your number is a negative integer");
        }
    }

    public void reset()
    {
        this.value = 0;
    }
}
public class DecreasingCounter
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value ->");
        int number = scan.nextInt();

        DecreasingCounter counter = new DecreasingCounter(number);
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.reset();
        counter.printValue();

    }
}