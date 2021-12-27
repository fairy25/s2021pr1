package tut9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Please delete the file hello.txt before running
 * in order to see the effect
 */
public class Act1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter w = new PrintWriter("src\\tut9\\hello.txt");
        // 1. The constructor of PrintWriter throws FileNotFoundException
        // 2. How many ways are there to get rid of this error?
        // (1) surround the statement in try-catch
        // (2) declare the method (main) to throw the FileNotFoundException
        w.println("Hello, world!");
        w.close(); // save
        // use Scanner to open the file "hello.txt" for reading
        Scanner sc = new Scanner(new File("src\\tut9\\hello.txt"));
        String s = sc.nextLine();
        System.out.println(s);
    }
}
