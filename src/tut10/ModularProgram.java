package tut10;

import java.util.Scanner;

/**
 * A simple menu-driven program with modular design.
 * Scalable, understandable...
 */
public class ModularProgram {
    public static void menu() {
        System.out.println("[1] Add item");
        System.out.println("[2] Item list");
        System.out.println("[3] Edit an item");
        System.out.println("[4] Remove an item");
        System.out.println("[5] Quit");
    }

    public static int getMenuChoice() {
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.print("Choose an option: ");
        return sc.nextInt();
    }

    public static void feature1() {
        System.out.println("do something...");
    }

    public static void feature2() {
        System.out.println("do something else...");
    }

    public static void feature3() {
        System.out.println("do something other thing...");
    }

    public static void feature4() {
        System.out.println("hmm...");
    }

    public static void main(String[] args) {
        int n = 1;
        while (n != 5) {
            n = getMenuChoice(); // clean?
            if (n == 1) feature1();
            if (n == 2) feature2();
            if (n == 3) feature3();
            if (n == 4) feature4();
        }
        System.out.println("Goodbye!");
    }
}
