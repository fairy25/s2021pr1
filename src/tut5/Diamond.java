package tut5;

public class Diamond {
    public static void main(String[] args) {
        int[] a = {1, 4, 9, 16, 25};
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
