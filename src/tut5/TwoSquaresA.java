package tut5;

import java.util.Scanner;

public class TwoSquaresA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (3 - 10): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // print n stars
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            // print 1 space
            System.out.print(" ");
            // print 1 star
            System.out.print("*");
            // print (n - 2) stars or spaces
            for (int j = 0; j < n - 2; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // print 1 star
            System.out.print("*");
            System.out.println(); // newline
        }
    }
}
