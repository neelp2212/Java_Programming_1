import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

class Song
{
    private String name;
    private int length;

    public Song(String name, int length)
    {
        this.name = name;
        this.length = length;
    }

    public String name()
    {
        return this.name;
    }

    public int length()
    {
        return this.length;
    }
}
public class Song
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the name of the song ->");
        String name = read.nextLine();
        System.out.println("Enter the length of the song in seconds ->");
        int length = read.nextInt();
        Song first = new Song(name,length);
        System.out.println("The song " + first.name() + " has a length of " + first.length() + " seconds");
    }
}