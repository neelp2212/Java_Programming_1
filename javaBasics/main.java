import java.util.Arraylist;
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
        /*


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

         */
        /*
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Unfit number");
                continue;
            }

            System.out.println(number * number);
        }

         */

             /*
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

         */
        /*
        Scanner scanner = new Scanner(System.in);
        int values = 0;
        int sum = 0;

        while (true) {
            System.out.println("Provide a value, a negative value ends the program");
            int value = Integer.parseInt(scanner.nextLine());
            if (value < 0) {
                break;
            }

            values = values + 1;
            sum = sum + value;
        }

        if (sum == 0) {
            System.out.println("The average of the values could not be calculated.");
        } else {
            System.out.println("Average of values: " + (1.0 * sum / values));
        }

         */
    /*
        Scanner x = new Scanner(System.in);
        System.out.print("Customer number: ");
        int y = Integer.valueOf(x.nextLine());

        if (y >= 1000 && y % 25 == 0) {
            System.out.println("Gets a gift card!");
        } else if (y % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        } else {
            System.out.println("Gets nothing.");
        }

     */
        // The array list is used to get numbers by its index and it is very helpful in companies.
    /*


        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Emma");
        list.add("Alex");
        list.add("Mary");

        System.out.println(list.get(2));

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(5);
        num.add(7);
        num.add(0);
        num.add(1);
        System.out.println("The sum of " + num.get(1) + " and " + num.get(2) + " is " );
        System.out.println(num.get(1) + num.get(2));

     */
        /*

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Number of values on the list: " + list.size());

        list.add("First");
        System.out.println("Number of values on the list: " + list.size());

        int values = list.size();

        list.add("Second");
        System.out.println("Number of values on the list: " + values);
         */

        // In this program execution it shows how the size of te list shows list.size();

    /*
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Emma");
        list.add("Alex");
        list.add("Mary");
        list.add("Tom");
        list.add("Emma");
        list.add("Alex");
        list.add("Mary");
        list.add("Tom");
        list.add("Emma");
        list.add("Alex");
        list.add("Mary");
        list.add("Tom");
        list.add("Emma");
        list.add("Alex");
        list.add("Mary");
        list.add("Tom");
        list.add("Emma");
        list.add("Alex");
        list.add("Mary");
        list.add("Tom");
        list.add("Emma");
        list.add("Alex");
        list.add("Mary");
        System.out.println("In Total: " + list.size());

     */
        /*
        String text = "volcanologist";

        if (text.contains("can")) {
            System.out.println("can was found");
        }

        if (!text.contains("tin")) {
            System.out.println("tin wasn't found");
        }

         */



        /*
        System.out.print("How many numbers? ");
        int howMany = Integer.valueOf(reader.nextLine());

        int[] numbers = new int[howMany];

        System.out.println("Enter the numbers:");

        int index = 0;
        while (index < numbers.length) {
            numbers[index] = Integer.valueOf(reader.nextLine());
            index = index + 1;
        }


        System.out.println("Here are the numbers again:");

        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index = index + 1;
        }

         */





    }
}
