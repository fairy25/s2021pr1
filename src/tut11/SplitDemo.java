package tut11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SplitDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src\\tut11\\story.txt"));
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            sb.append(sc.nextLine()).append(" ");
        }
        String[] words = sb.toString().toLowerCase().split(" ");
        Set<String> vocab = new TreeSet<>();
        for (String w : words) {
            vocab.add(w);
        }
        vocab.remove("");
        System.out.println(vocab);
    }
}
