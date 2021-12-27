package tut2;

public class LargestOfThreeA {
    public static void main(String[] args) {
        int a = 3, b = 6, c = 2, max = 0;
        // which will be max if a = b = c?
        if (a > b && a > c)
            max = a;
        else if (b > c)
            max = b;
        else
            max = c;
        System.out.println("Among " + a + ", " + b + " and " + c + ", the largest is " + max + ".");
    }
}
