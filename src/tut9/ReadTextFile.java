package tut9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner file = new Scanner(new File("src\\tut9\\input.txt"));
        String fileContent = "";
        while (file.hasNext()) {
            fileContent += file.nextLine() + "\n";
        }
        System.out.println(fileContent);
    }
}
