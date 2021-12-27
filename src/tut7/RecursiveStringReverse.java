package tut7;

import java.util.Scanner;

public class RecursiveStringReverse {
    public static String reverse(String s) {
        if (s.length() == 0) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
            // reverse("abc")
            // = reverse("bc") + "a"
            // = reverse("c") + "b" + "a"
            // = reverse("") + "c" + "b" + "c"
            // =         "" + "c" + "b" + "c"
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The reverse string is: " + reverse(s));
    }
}
