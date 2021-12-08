public class guestlist {
    public static void main(String[] args) {
        // Exercise 3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.

        // System.out.println("Name of the file: ");

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {

                String row = fileScanner.nextLine();

                list.add(row);

            }

        } catch (Exception e) {

            System.out.println("Error:" + e.getMessage());
        }

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");

    }
}