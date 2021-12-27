package tut7;

public class RecursiveBinary {
    public static String toBinary(int n) {
        if (n == 0) {
            return "0"; // base case: toBinary(0)
        } else if (n == 1) {
            return "1"; // base case: toBinary(1)
        } else {
            return toBinary(n / 2) + (n % 2); // general case
        }
    }

    public static void main(String[] args) {
        // TODO: use Scanner to get user input
        System.out.println(toBinary(0));
        System.out.println(toBinary(1));
        System.out.println(toBinary(2));
        System.out.println(toBinary(3));
        System.out.println(toBinary(4));
        System.out.println(toBinary(453));
        System.out.println(toBinary(20013));
    }
}
