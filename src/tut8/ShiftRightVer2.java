package tut8;

public class ShiftRightVer2 {
    /**
     * Modifying input array in a void method
     */
    public static void shiftRight(int[] a) {
        a[0] = 5;
    }

    public static void method2(int x) {
        x = 11;
    }

    public static void main(String[] args) {
        int a = 10;
        method2(a);
        System.out.println(a);
    }
}
