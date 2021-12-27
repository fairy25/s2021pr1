package tut5;

public class TwoSquaresB {
    public static void repeat(char c, int t) {
        for (int i = 0; i < t; i++) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            repeat('*', n);
            System.out.print(' ');
            repeat('*', 1);
            if (i == 0 || i == n - 1) {
                repeat('*', n - 2);
            } else {
                repeat(' ', n - 2);
            }
            repeat('*', 1);
            System.out.println();
        }
    }
}
