package tut9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Please delete the file output.txt before running
 * in order to see the effect
 */
public class Act2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src\\tut9\\input.txt"));
            PrintWriter w = new PrintWriter("src\\tut9\\output.txt");
            while (sc.hasNext()) {
                String s = sc.nextLine();
                if (!s.isEmpty()) {
                    w.println(s);
                }
            }
            w.close();
        } catch (Exception e) {

        }
    }
}
