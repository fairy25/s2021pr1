package tut7;

/**
 * This is the implementation of exercise P7.7
 * From the book Big Java (7e, 2019) by Cay S. Horstmann
 */
public class MagicSquare {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        int row = n - 1, column = n / 2;
        for (int k = 1; k <= n * n; k++) {
            a[row][column] = k;
            int r = row, c = column;
            row++;
            column++;
            if (row == n) row = 0;
            if (column == n) column = 0;
            if (a[row][column] != 0) {
                column = c;
                row = r - 1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
