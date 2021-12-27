package tut4;

public class CountDigitsB {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        System.out.println(a);
        if (a < 0) a = -a;
        System.out.println(a);
        int c = 0;
        while (a > 0) {
            c++;
            a = a / 10;
        }
        System.out.println(c);
    }
}
