package tut5;

public class TwoSquaresC {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
                if (j == n || (i > 0 && i < n - 1 && j > n + 1 && j < 2 * n)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
