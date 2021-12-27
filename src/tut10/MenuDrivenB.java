package tut10;

import java.util.Scanner;

public class MenuDrivenB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        while (n != 5) {
            System.out.print("Menu... Your choice: ");
            try {
                n = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Invalid input!!!");
                continue;
            }
            if (n == 1) System.out.println("Adding an item...");
            if (n == 2) System.out.println("Listing all items...");
            if (n == 3) System.out.println("Editing an item...");
            if (n == 4) System.out.println("Removing an item...");
            if (n == 5) System.out.println("Goodbye!");
            if (n < 1 || n > 5) System.out.println("Invalid choice!");
        }
    }
}
