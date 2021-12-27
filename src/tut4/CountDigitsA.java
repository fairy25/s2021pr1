package tut4;

public class CountDigitsA {
    public static void main(String[] args) {
        int a = 2078743454;
        int x = 1; // 10, 100, 1000...
        int c = 0; // number of digits
        if (a < 2) {
            c = 1;
        } else {
            while (a > x && x <= 1000000000) {
                c++;
                x = x * 10;
                System.out.println(x);
            }
        }
        System.out.println(c + " digits");
    }
}
// 10, 1000, 10000,....1000000000,10000000000 (out of range for int)