package tut5;

import java.util.Scanner;

public class Dec2Bin {
    public static String toBinary(int dec) {
        if (dec < 0) return null;
        else if (dec == 0) return "0";
        else {
            String out = "";
            while (dec > 0) {
                out = (dec % 2) + out;
                dec /= 2;
            }
            return out;
        }
    }

    public static void main(String[] args) {
        // test
        System.out.println(toBinary(-1));
        System.out.println(toBinary(0));
        System.out.println(toBinary(1));
        System.out.println(toBinary(2));
        System.out.println(toBinary(5));
        System.out.println(toBinary(10));
        System.out.println(toBinary(15));
        System.out.println(toBinary(12345));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        String bin = toBinary(n);
        System.out.println("Its binary string is: " + bin);
    }
}
