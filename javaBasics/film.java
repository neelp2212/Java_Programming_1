import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

class Film
{
    private String name;
    private int ageRating;

    public Film(String filmName, int filmRating)
    {
        this.name = filmName;
        this.ageRating = filmRating;
    }

    public String name()
    {
        return this.name;
    }

    public int ageRating()
    {
        return this.ageRating;
    }
}




public class film
{
public static void main(String[] args)
        {
       /*
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the name of the song ->");
        String name = read.nextLine();
        System.out.println("Enter the length of the song in seconds ->");
        int length = read.nextInt();
        Film first = new Film(name,length);
        System.out.println("The song " + first.name() + " has a length of " + first.length() + " seconds.");

        */
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()) {
        System.out.println("You may watch the film " + chipmunks.name());
        } else {
        System.out.println("You may not watch the film " + chipmunks.name());
        }
        }
}