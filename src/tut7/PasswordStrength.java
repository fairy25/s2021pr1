package tut7;

import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new password: ");
        String password = sc.nextLine();
        int score = 0;
        if (password.length() > 12) {
            score = 2;
        } else if (password.length() >= 8) {
            score = 1;
        }
        int upper = 0, lower = 0, digit = 0, symbol = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == ' ') {
                System.out.println("Space is not allowed in password!");
                System.exit(0);
            }
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                upper = 1;
            } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                lower = 1;
            } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                digit = 1;
            } else {
                symbol = 1;
            }
        }
        score = score + upper + lower + digit + symbol;
        System.out.print("Strength: " + score);
        if (score > 4) {
            System.out.println(" (strong)");
        } else if (score > 2) {
            System.out.println(" (medium)");
        } else {
            System.out.println(" (weak)");
        }
    }
}
