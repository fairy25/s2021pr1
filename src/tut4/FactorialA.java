package tut4;

public class FactorialA {
    public static void main(String[] args) {
        int n = 6;
        int n0 = n;
        int f = 1;
        if (n < 0) {
            System.out.println("Cannot calculate factorial!");
        } else {
            while (n > 0) {
                f = f * n;
                n--;
            }
            System.out.println(n0 + "! = " + f);
        }
    }
}
