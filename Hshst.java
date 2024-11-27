package Practh;

import java.util.HashSet;
import java.util.Scanner;

public class Hshst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> il = new HashSet<>();
        String choice;

        System.out.println("Welcome to the ISBN Manager!");
        do {
            System.out.print("Enter the ISBN to add: ");
            String isbn = sc.nextLine();

            if (il.contains(isbn)) {
                System.out.println("Duplicate not added.");
            } else {
                il.add(isbn);
                System.out.println("ISBN added successfully.");
            }

            System.out.print("Would you like to add another ISBN? (yes/no): ");
            choice = sc.nextLine().trim().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("\nAll unique ISBNs:");
        for (String isbn1 : il) {
            System.out.println(isbn1);
        }

        sc.close();
    }
}
