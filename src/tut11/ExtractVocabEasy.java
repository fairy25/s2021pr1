package tut11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExtractVocabEasy {

    public static void main(String[] args) throws IOException {
        String fullText = "";
        Scanner sc = new Scanner(new File("src\\tut11\\story.txt"));
        while (sc.hasNext()) {
            fullText += sc.nextLine() + " ";
        }
        fullText = fullText.toLowerCase();
        String[] words = fullText.split(" ");
        Set<String> vocab = new TreeSet<>();
        for (String w : words) {
            vocab.add(w);
        }
        vocab.remove("");
        System.out.println(vocab);
    }
}
