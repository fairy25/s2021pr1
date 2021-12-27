package tut6;

public class Factors {
    public static void main(String[] args) {
        // n = 8, f = 2
        // 1st factor: 2, n = 4
        // 2nd factor: 2, n = 2
        // 3rd factor: 2, n = 1
        // 8 = 2 * 2 * 2
        int n = 15000;
        int f = 2;
        while (n > 1) {
            if (n % f == 0) {
                System.out.print(f + " ");
                n = n / f;
            } else {
                f++;
            }
        }
    }
}
