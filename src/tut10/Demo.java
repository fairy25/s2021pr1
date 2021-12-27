package tut10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    // it's a good idea to divide the program into separate modules
    // a good quality of the modules is that they should be as independent as possible
    // in Java we divide a program into methods
    // each method should have a single responsibility

    public static int getUserChoice() {
        Scanner in = new Scanner(System.in);
        // show menu and get user's choice
        System.out.println("[1] Write ArrayList of Strings to file");
        System.out.println("[2] Read ArrayList of Strings from file");
        System.out.println("[0] Quit");
        System.out.print("Choose an option: ");
        return in.nextInt();
    }

    public static void feature1() {
        ArrayList<String> arList = new ArrayList<>();
        arList.add("String 1");
        arList.add("String 2");
        arList.add("String 3");
        try {
            // data.bin will be at project's root folder
            FileOutputStream fos = new FileOutputStream("src\\tut10\\data.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arList);
            oos.close();
            System.out.println("ArrayList has been written into data.bin");
        } catch (IOException e) { // will catch both FileNotFoundException and IOException
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void feature2() {
        System.out.println("data.bin contains:");
        try {
            // this constructor may throw FileNotFoundException
            FileInputStream fis = new FileInputStream("src\\tut10\\data.bin");
            // this constructor may throw IOException
            ObjectInputStream ois = new ObjectInputStream(fis);
            /*
             readObject() may throw ClassNotFoundException
             We have to cast Object into ArrayList<String>
             because readObject() always returns Object
             */
            ArrayList<String> arList = (ArrayList<String>) ois.readObject();
            for (String s : arList) {
                System.out.println(s);
            }
            // close() may throw IOException
            ois.close();
        } catch (Exception e) { // will catch any kind of Exception
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // main program loop
        int n = 1;
        while (n != 0) { // will top when n == 0
            n = getUserChoice();
            if (n == 1) feature1();
            if (n == 2) feature2();
            if (n == 0) System.out.println("Goodbye!");
        }
    }
}
