package tut11;

import java.util.*;

public class ClassManager {

    static Map<String, List<String>> data;
    static Scanner sc;

    static int getUserChoice() {
        System.out.println("[1] Add student to a class");
        System.out.println("[2] View students in a class");
        System.out.println("[3] Quit");
        System.out.print("Choose a feature: ");
        int n = 0;
        while (n < 1 || n > 3) {
            try {
                n = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Invalid input!!!");
            }
        }
        return n;
    }

    static void addStudent() {
        System.out.print("Enter class name: ");
        String className = sc.nextLine();
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        if (data.containsKey(className)) {
            // existing class
            data.get(className).add(studentName);
        } else {
            // new class
            List<String> a = new LinkedList<>();
            a.add(studentName);
            data.put(className, a);
        }
    }

    static void showStudents() {
        System.out.print("Enter class name: ");
        String className = sc.nextLine();
        if (data.containsKey(className)) {
            List<String> a = data.get(className);
            System.out.println("List of students in class [" + className + "]: " + a);
            for (int i = 0; i < a.size(); i++) {
                System.out.println((i + 1) + ". " + a.get(i));
            }
        } else {
            System.out.println("Class not found!");
        }
    }

    public static void main(String[] args) {
        data = new HashMap<>();
        sc = new Scanner(System.in);
        int n = 0;
        while (n != 3) {
            n = getUserChoice();
            if (n == 1) addStudent();
            if (n == 2) showStudents();
        }
        System.out.println("Goodbye!");
    }
}
