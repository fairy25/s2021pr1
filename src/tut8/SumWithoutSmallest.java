package tut8;

public class SumWithoutSmallest {
    public static int sumWithoutSmallest(int[] a) {
        int sum = 0, min = a[0];
        for (int e : a) {
            sum += e;
            if (e < min) min = e;
        }
        return (sum - min);
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 1, 3};
        // the sum without the smallest value: 4 + 5 + 2 + 3 = 14
        // answer: sum - min
        // goal: in 1 loop, calculate sum and find out min value
        // return (sum - min)
        System.out.println(sumWithoutSmallest(a));
    }
}
