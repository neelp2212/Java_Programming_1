
import java.util.Scanner;

class main {

    public static void main(String[] args) {

        /*    Scanner reader = new Scanner(System.in);

        System.out.println("Write the first string:");
        String first = reader.nextLine();
        System.out.println("Write the second string:");
        String second = reader.nextLine();
        System.out.println("Write the third string:");
        String third = reader.nextLine();

        System.out.println("Last string you wrote was " + third + ", which ");
        System.out.println("was preceded by " + second+ ".");
        System.out.println("The first string was" + first + ".");

        System.out.println("All together: " + first + second + third);

    */

    /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter number 2");
        int num2 = Integer.parseInt(scan.nextLine());
        int addition = num1 + num2;
        //int subtraction;
        if (num1>num2)
        {
            System.out.println(num1 - num2);
        }
        else
        {
            System.out.println(num2 - num1);
        }
        int division = num1 / num2;
        int multiplication = num1 * num2;
        System.out.println(addition);
        //System.out.println();
        System.out.println(division);
        System.out.println(multiplication);

     */

    /*    Scanner scan = new Scanner(System.in);
        System.out.println("Give Points[0-100]: ");
        int grade = Integer.parseInt(scan.nextLine());
        if (grade < 0)
        {
            System.out.println("Impossible!");
        }
        else if ( grade > 0 && grade <= 49 )
        {
            System.out.println("Failed !");
        }
        else if (grade >= 50 && grade <= 59)
        {
            System.out.println("Your Grade is 1");
        }
        else if (grade >= 60 && grade <= 69)
        {
            System.out.println("Your Grade is 2");
        }
        else if (grade >= 70 && grade <= 79)
        {
            System.out.println("Your Grade is 3");
        }
        else if (grade >= 80 && grade <= 89)
        {
            System.out.println("Your Grade is 4");
        }
        else if (grade >= 90 && grade <= 100)
        {
            System.out.println("Your Grade is 5 ! Excellent work");
        }
        else
        {
            System.out.println("Sorry There is no grade after 100 ! you are incredible");
        }

     */
        // Creating the scanner
        /*
        Scanner reader = new Scanner(System.in);

        // Identifying the input values and declaring the variables for them
        int first ;
        int second ;

        // Assigning the user input to the variables
        System.out.println("Enter the First number : ");
        first = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number: ");
        second = Integer.parseInt(reader.nextLine());

        // Identifying the operation and declaring a variable for the result
        int product = first * second;

        // Printing the result of the operation
        System.out.println("The product of " + first + " and " + second + " is " + product);

         */
    /*
        Scanner sqr = new Scanner(System.in);
        System.out.println("Enter the number to print its square: ");
        int num = Integer.parseInt(sqr.nextLine());
        int square = num * num;
        System.out.println("The square of " + num + " is " + square);

     */
    /*
        Scanner reader = new Scanner(System.in);

        // Declaring the variables and assigning user input to them
        System.out.println("Enter the number 1: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the number 2: ");
        int second = Integer.parseInt(reader.nextLine());

        // Identifying the operation and declaring variable for the result
        int sum = first + second;

        // Doing something with the result. In this case
        // the result is used in the conditional operations.

        if (sum > 100) { // if the sum is over 100
            System.out.println("The sum of " + sum +  " is too much");
        } else if (sum < 0) { // if the sum is less than 0
            System.out.println("Sorry its out of Budget");
        } else { // otherwise
            System.out.println("It is ok");
        }

     */

        // This is used to generate a number continuously and it ends when you enter 0.
        /*
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Input a number, 0 to quit");
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 0)
            {
                break;
            }
            System.out.println("You input " + command);
        }
        System.out.println("Done, thank you!");

         */

        // Number changes when
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Insert positive integers");
            int number = Integer.parseInt(scanner.nextLine());

            if (number <= 0)
            {
                System.out.println("Unfit number! Try again.");
                continue;
            }

            System.out.println("Your input was " + number);
        }

    }
}