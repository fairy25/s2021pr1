package tut9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("mary.txt"));
        PrintWriter w = new PrintWriter("mary2.txt");
        int lineNumber = 1;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            w.println(lineNumber + ". " + s);
            lineNumber++;
        }
        w.close();
    }
}
