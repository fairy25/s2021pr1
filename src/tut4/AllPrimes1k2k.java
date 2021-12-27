package tut4;

public class AllPrimes1k2k {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 2000; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count + " prime numbers are found.");
    }
}
