package tut8;

public class PrimeProbability {

    /*
     Generate random integer between 2 and 1000 (inclusive)
     0 <= Math.random() < 1
     0 <= Math.random() * 999 < 999
     2 <= Math.random() * 999 + 2 < 1001
     2 <= (int) (Math.random() * 999 + 2) <= 1000
     */
    public static int randomInt() {
        return (int) (Math.random() * 999 + 2);
    }

    /*
     Check if the input number is prime
     */
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (isPrime(randomInt())) {
                count++;
            }
        }
        System.out.println("The probability of prime number is " + count + "%.");
    }
}
