package tut4;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int sum = 0;
            for (int n = i; n > 0; n /= 10) {
                sum += (int) Math.pow(n % 10, 3); // cube of a digit
            }
            if (sum == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
}

