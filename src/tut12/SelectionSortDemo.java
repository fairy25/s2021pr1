package tut12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SelectionSortDemo {

    /**
     * Usage:
     *    int[] arr = {....};
     *    int[] brr = selectionSort(arr);
     */
    static int[] selectionSort(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[p]) {
                    p = j;
                }
            }
            b[i] = a[p];
            a[p] = a[i];
        }
        return b;
    }

    /**
     * Usage:
     *    int[] arr = {....};
     *    selectionSortB(arr);
     */
    static void selectionSortB(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[p]) {
                    p = j;
                }
            }
            int tmp = a[i];
            a[i] = a[p];
            a[p] = tmp;
        }
    }

    static void selectionSortC(double[] a, String[] names) {
        for (int i = 0; i < a.length - 1; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[p]) {
                    p = j;
                }
            }
            // swap(a[i], a[p]) and also swap(names[i], names[p])
            double tmp = a[i];
            String s = names[i];
            a[i] = a[p];
            names[i] = names[p];
            a[p] = tmp;
            names[p] = s;
        }
    }

    static void selectionSortD(Student[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].score > a[p].score) {
                    p = j;
                }
            }
            Student tmp = a[i];
            a[i] = a[p];
            a[p] = tmp;
        }
    }

    static Student[] selectionSortE(Student[] a) {
        Student[] b = new Student[a.length];
        for (int i = 0; i < a.length; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].score < a[p].score) {
                    p = j;
                }
            }
            b[i] = a[p];
            a[p] = a[i];
        }
        return b;
    }

    static List<Student> selectionSortF(List<Student> a) {
        List<Student> b = new ArrayList<>();
        while (a.size() > 0) {
            int min = 0;
            for (int i = 1; i < a.size(); i++) {
                if (a.get(i).score < a.get(min).score) {
                    min = i;
                }
            }
            b.add(a.remove(min));
        }
        return b;
    }

    public static void main(String[] args) {

        int[] test = {2, 7, 4, 12, 0, 3, -5};
        test = selectionSort(test);
        System.out.println(Arrays.toString(test));

        int[] test2 = {2, 7, 4, 12, 0, 3, -5};
        selectionSortB(test2);
        System.out.println(Arrays.toString(test2));

        String[] names = {"Quan", "Long", "Cong"};
        double[] scores = {8.0, 7.5, 8.5};
        // {7.5, 8.0, 8.5}
        // {"Long", "Quan", "Cong"}
        selectionSortC(scores, names);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));

        Student[] students = {
                new Student("Quan", 8.0),
                new Student("Long", 7.5),
                new Student("Cong", 8.5)
        };

        selectionSortD(students);

        for (Student s : students) {
            System.out.println(s.name + ": " + s.score);
        }

        students = new Student[]{
                new Student("Quan", 8.0),
                new Student("Long", 7.5),
                new Student("Cong", 8.5)
        };

        Student[] b = selectionSortE(students);

        for (Student s : b) {
            System.out.println(s.name + ": " + s.score);
        }

        List<Student> stList = new ArrayList<>(Arrays.asList(
                new Student("Quan", 8.0),
                new Student("Long", 7.5),
                new Student("Cong", 8.5)));

        List<Student> stList2 = selectionSortF(stList);

        for (Student s : stList2) {
            System.out.println(s.name + ": " + s.score);
        }

    }
}
