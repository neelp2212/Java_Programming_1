import java.util.ArrayList;
import java .util.Scanner;

class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name,int age) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

}
public class  array_list {
    public static void main(String[] args) {
        /*
        ArrayList<String> names = new ArrayList<>();

        String name = "Neel Patel";

        names.add("Kiran Patel");
        names.add("Sneh Patel");
        names.add("Hetvi Patel");
        names.add("Usha Patel");


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

         */
        /*

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            persons.add(new Person(name));
        }

        System.out.println();
        System.out.println("Persons in total: " + persons.size());
        System.out.println("Persons: ");

        for (Person person: persons)
        {
            System.out.println(person);
        }

         */

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

// Read person information from the user
        while (true) {
            System.out.print("Enter name, empty will end: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter the age of the person " + name + ": ");

            int age = Integer.valueOf(scanner.nextLine());

            // We add a new person to the list.
            // The person's name and age were decided by the user
            persons.add(new Person(name, age));
        }

            // We'll print the number of the inputted persons, and the persons themselves
        System.out.println();
        System.out.println("Total number of persons: " + persons.size());
        System.out.println("Persons: ");

        for (Person person: persons) {
            System.out.println(person);
        }

    }
}