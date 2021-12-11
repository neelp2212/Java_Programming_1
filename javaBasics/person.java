import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;


class Person
{
    private String name;
    private int age;

    public Person(String initialName, int age)
    {
        this.name = initialName;
        this.age = age;
    }
    public void printPerson()
    {
        System.out.println(this.name + ", age " + this.age + " Years");
    }
    public void growOlder()
    {
        if (this.age < 30)
        {
            this.age = this.age + 1;
        }
    }
    public int returnAge()
    {
        return this.age;
    }
}

public class person {

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the name ->");
        String name = read.nextLine();
        System.out.println("Enter the age ->");
        int age = read.nextInt();
        Person one = new Person(name,age);
        Person two = new Person(name,age);
        one.growOlder();
        one.growOlder();
        two.growOlder();

        System.out.println("The name and age you enter is ->" + name + one.returnAge());
        int combined = one.returnAge() + two.returnAge();

        System.out.println("The age of both person is ->" + combined);
    }
}