package tut4;

import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        int year;
        double balance, rate;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many years do you want to deposit your money? ");
        year = sc.nextInt();
        System.out.print("How much money? ");
        balance = sc.nextDouble();
        System.out.print("What's the interest rate (%)? ");
        rate = sc.nextDouble();
        System.out.print("After " + year + " years, you’ll receive ");
        for (int i = 0; i < year; i++) {
            balance += balance * rate / 100;
        }
        System.out.println((Math.floor(balance * 100) / 100));
    }
}
