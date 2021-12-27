package tut8;

public class ShiftRightVer1 {
    /**
     * Returning a new array, not modifying input array
     */
    public static int[] shiftRight(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {
            b[i + 1] = a[i];
        }
        b[0] = a[a.length - 1];
        return b;
    }

    public static void main(String[] args) {
        int[] sample = {1, 2, 3, 4};
        int[] result = shiftRight(sample);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
