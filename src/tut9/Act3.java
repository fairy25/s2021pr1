package tut9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Please delete the file mary2.txt before running
 * in order to see the effect
 */
public class Act3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src\\tut9\\mary.txt"));
        PrintWriter w = new PrintWriter("src\\tut9\\mary2.txt");
        int lineNumber = 1;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            w.println(lineNumber + ". " + s);
            lineNumber++;
        }
        w.close();
    }
}
