package tut12;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayIntersectionDemo {
    static HashSet<Integer> intersect(HashSet<Integer> a,
                                      HashSet<Integer> b) {
        HashSet<Integer> c = new HashSet<>();
        if (a.size() > b.size()) {
            // Swap(A,B)
            HashSet<Integer> x = a;
            a = b;
            b = x;
        }
        for (int x : a) {
            if (b.contains(x)) {
                c.add(x);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(6, 3, 4, 5, 2, 7));
        HashSet<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(4, 15, 11, 3, 5));
        System.out.println(intersect(a, b));
    }
}
