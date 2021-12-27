package tut4;

import java.util.Scanner;

public class FactorialB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for " + n);
        } else {
            System.out.print("Factorial of " + n + " is ");
            int fact = 1; // n! = 1 * n * (n - 1) * (n - 2) * ... * 1
            while (n > 0) {
                fact = fact * n;
                n--;
            }
            System.out.println(fact);
        }
    }

}
