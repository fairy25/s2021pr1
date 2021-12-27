package tut4;

public class PrimeNumber {
    public static void main(String[] args) {
        // let user enter a number
        int n = 7;
        // prime is only divisible by 1 and itself
        // check from 2 to n - 1
        boolean isPrime = true;
        if (n < 2) isPrime = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                // just one case will prove that N is not prime
                // because this is enough proof, we'll break
                break;
            }
        } // if this loop runs through, n is not divisible by any number from 2 -> n - 1
        // isPrime would still be True, it has never been turned into False
        // -> at this point, isPrime is the answer
        if (isPrime) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }
}
