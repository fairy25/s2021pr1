package tut10;

import java.util.Scanner;

public class MenuDrivenA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        while (opt != 5) {
            System.out.print("[1] Add item\n"
                    + "[2] Item list\n"
                    + "[3] Edit an item\n"
                    + "[4] Remove an item\n"
                    + "[5] Quit\n"
                    + "Choose an option: ");
            opt = sc.nextInt();
            sc.nextLine(); // clear the newline character from buffer
            switch (opt) {
                case 1:
                    System.out.println("Adding a new item...");
                    break;
                case 2:
                    System.out.println("Listing all items...");
                    break;
                case 3:
                    System.out.println("Editing an item...");
                    break;
                case 4:
                    System.out.println("Removing an item...");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}
