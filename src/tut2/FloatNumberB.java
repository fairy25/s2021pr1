package tut2;

public class FloatNumberB {
    public static void main(String[] args) {
        double d = 100.5;
        System.out.print("(" + d + ") ");
        if (d < -1000000) {
            System.out.println("A large negative number.");
        } else if (d <= -1) {
            System.out.println("A negative number.");
        } else if (d < 0) {
            System.out.println("A small negative number.");
        } else if (d == 0) {
            System.out.println("The number is zero.");
        } else if (d < 1) {
            System.out.println("A small positive number.");
        } else if (d <= 1000000) {
            System.out.println("A positive number.");
        } else {
            System.out.println("A large positive number.");
        }
    }
}
