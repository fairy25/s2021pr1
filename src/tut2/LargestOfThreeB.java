package tut2;

public class LargestOfThreeB {
    public static void main(String[] args) {
        int a = 2, b = 6, c = 3, d = 8;
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        System.out.println("Among " + a + ", " + b + ", " + c + ", " + d + ", largest is " + max + ".");
    }
}
