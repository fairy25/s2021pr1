package tut5;

import java.util.Scanner;

public class ArrayOfFloats {
    public static double[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers are there in the list? ");
        int n = sc.nextInt();
        double[] set = new double[n];
        System.out.print("Please enter " + n + " float numbers: ");
        for (int i = 0; i < n; i++) {
            set[i] = sc.nextDouble();
        }
        return set;
    }

    public static double average(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static double min(double[] a) {
        double m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < m) m = a[i];
        }
        return m;
    }

    public static double max(double[] a) {
        double m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) m = a[i];
        }
        return m;
    }

    public static void main(String[] args) {
        double[] list = getInput();
        double min = min(list);
        double max = max(list);
        System.out.println("The average of the list is " + average(list));
        System.out.println("The smallest value in the list is " + min);
        System.out.println("The largest value in the list is " + max);
        System.out.println("The range of the list is " + (max - min));
    }
}
