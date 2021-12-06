import java .util.Scanner;
import java.nio.file.Paths;

public class fileReading
{
    public static void main(String[] args)
    {

        /*
        Write a program that reads strings from the user until the
        user inputs the string "end". At that point, the program
        should print how many strings have been read. The string
        "end" should not be included in the number strings read. You
        can find some examples below of how the program works.


        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to end the string than please write 'end' ");

        while (true)
        {
            String line = scanner.nextLine();

            if (line.equals("end"))
            {
                break;
            }
        }
        String count = String.valueOf(scanner);
        System.out.println(scanner);
        Write a program that reads strings from the user until the user
        inputs the string end. As long as inout is not an "end", the program
        should handle the input as an integer and print the cube of the number
        which is provided.
         */
        /*

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            String userInput = scanner.nextLine();

            if (userInput.equals("end"))
            {
                break;
            }
            int userInputToInt = Integer.valueOf(userInput);

            int result = (userInputToInt * userInputToInt) * userInputToInt;

            System.out.println(result);

}
         */


        try (Scanner scanner = new Scanner(Paths.get("./src/com/Hey.txt")))
        {
            while (scanner.hasNextLine())
            {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }
}