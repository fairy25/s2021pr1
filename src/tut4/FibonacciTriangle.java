package tut4;

public class FibonacciTriangle {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        a[0][0] = 1;
        a[0][1] = 1;
        a[1][0] = 1;
        a[1][1] = 1;
        a[2][1] = 1;
        int n = 2;
        int m = 0;
        for (int i = n; i < 10; i++) {
            a[i][m] = a[i - 1][m] + a[i - 2][m];
            a[m][i] = a[m][i - 1] + a[m][i - 2];
        }
        n = 2; m = 1;
        for (int i = n; i < 10; i++) {
            a[i][m] = a[i - 1][m] + a[i - 2][m];
            a[m][i] = a[m][i - 1] + a[m][i - 2];
        }
        while (n < 7) {
            m++;
            for (int i = n; i < 10; i++) {
                a[i][m] = a[i - 1][m] + a[i - 2][m];
                a[m][i] = a[m][i - 1] + a[m][i - 2];
            }
            n++;
        }
        // print out
        for (int i = 0; i < 10; i++) {
            for (int l = 0; l < 10 - i; l++) {
                System.out.print("  ");
            }
            int x = i, j = 0;
            while (x >= 0) {
                if (a[j][x] < 10) {
                    System.out.print(a[j][x] + "   ");
                } else if (a[j][x] < 100) {
                    System.out.print(a[j][x] +  "  ");
                } else {
                    System.out.print(a[j][x] + " ");
                }
                x--;
                j++;
            }
            System.out.println();
        }

        //         0,0
        //      0,1   1,0
        //    0,2   1,1   2,0
        //  0,3  1,2   2,1  3,0
    }
}
