package tut3;

import java.util.Scanner;

public class WelcomeTeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = sc.nextInt();
        if (age < 13) {
            System.out.println("Not for kids!");
        } else if (age <= 19) {
            System.out.println("Welcome, teenager!");
        } else {
            System.out.println("You're too old!");
        }
    }
}
