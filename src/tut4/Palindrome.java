package tut4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int x = sc.nextInt();
        int saved = x;
        int reverse = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x = x / 10;
        }
        if (reverse == saved) {
            System.out.println("It is a palindrome number.");
        } else {
            System.out.println("It isn't a palindrome number.");
        }
    }
}
