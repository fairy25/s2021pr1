package tut7;

import java.util.Scanner;

public class ThousandSeparatingComma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0; // method scope + initialized
        boolean gotIt = false;
        while (!gotIt) {
            try {
                System.out.print("Please enter an integer between 1000 and 999999: ");
                n = sc.nextInt();
                gotIt = (n > 999 && n < 1000000);
            } catch (Exception e) {
                // nextLine is to clear the stdin buffer
                // that hasn't been cleared by nextInt()
                // without nextLine(), the invalid input is still in buffer
                System.out.println("Invalid input detected: " + sc.nextLine());
            }
        }
        String s = Integer.toString(n);
        s = s.substring(0, s.length() - 3) + "," + s.substring(s.length() - 3);
        System.out.println(s);
    }
}
