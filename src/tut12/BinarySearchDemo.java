package tut12;

public class BinarySearchDemo {
    static int binarySearch(int[] a, int k, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (high + low) / 2;
        if (a[mid] == k) {
            return mid;
        } else if (a[mid] > k) {
            return binarySearch(a, k, low, mid - 1);
        } else {
            return binarySearch(a, k, mid + 1, high);
        }
    }

    static int binSearch(int[] a, int k) {
        return binarySearch(a, k, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] test = {1, 5, 12, 16, 27, 33, 56, 65, 84, 98, 101};
        System.out.println(binSearch(test, 12));
        System.out.println(binSearch(test, 55));
    }
}
