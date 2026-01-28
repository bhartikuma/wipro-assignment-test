package bharti;

import java.util.*;

public class PatientRegUsingSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> uid = new HashSet<>();

        uid.add(12);
        uid.add(31);
        uid.add(32);
        uid.add(13);
        uid.add(11);

        while (true) {

            System.out.println("Please Select One Option");
            System.out.println("1. Add New Patient ID");
            System.out.println("2. View All Patient IDs");
            System.out.println("3. Exit");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("invalid input Please enter numbers only.");
                sc.next(); 
                continue;
            }

            if (choice == 1) {

                System.out.println("Enter New ID: ");
                int newId;

                try {
                    newId = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("envalid ID! Please enter numeric ID only.");
                    sc.next(); 
                    continue;
                }

                if (uid.contains(newId)) {
                    System.out.println("This id already exists");
                } else {
                    uid.add(newId);
                    System.out.println("new ID added Successfully");
                }

            } else if (choice == 2) {

                System.out.println("Registered Patient IDs:");
                for (Integer id : uid) {
                    System.out.println(id);
                }

            } else if (choice == 3) {

                System.out.println("Exiting Program...");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
