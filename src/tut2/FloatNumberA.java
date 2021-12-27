package tut2;

public class FloatNumberA {
    public static void main(String[] args) {
        double d = 100.5;
        if (d == 0) {
            System.out.println("(" + d + ") The number is zero.");
        } else {
            if (d > 0) { // positive
                if (d < 1) {
                    System.out.println("(" + d + ") A small positive number.");
                } else if (d > 1000000) {
                    System.out.println("(" + d + ") A large positive number.");
                } else {
                    System.out.println("(" + d + ") A positive number.");
                }
            } else { // negative
                if (d > -1) {
                    System.out.println("(" + d + ") A small negative number.");
                } else if (d < -1000000) {
                    System.out.println("(" + d + ") A large negative number.");
                } else {
                    System.out.println("(" + d + ") A negative number.");
                }
            }
        }
    }
}
