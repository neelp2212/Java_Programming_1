import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;


class TelevisionProgram {

    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}


public class telivision_program
{
    public static void main(String[] args)
    {

        while (true) {
            System.out.println("Enter empty line to exit the program");
            Scanner read = new Scanner(System.in);
            System.out.println("Enter Program Name:");
            String name = read.nextLine();
            if (name.isEmpty())
            {
                break;
            }

            System.out.println("Enter Program Duration or press 0 to exit the program: ");
            int d1 = read.nextInt();
            if (d1 == 0)
            {
                break;
            }

            TelevisionProgram program = new TelevisionProgram(name, d1);
            System.out.println(program);

            System.out.println("Maximum duration of program:");
            int getMaxDuration = read.nextInt();

            if (getMaxDuration <= program.getDuration()) {
                System.out.println(program.getName());
            } else {
                System.out.println("No Program of this duration available");
            }
        }
        System.out.println("Thank You");
    }
}
