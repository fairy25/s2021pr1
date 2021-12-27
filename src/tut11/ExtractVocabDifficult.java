package tut11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExtractVocabDifficult {

    static String removePuctuations(String s) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // keep: letters, spaces, single quotes (')
            if (Character.isLetter(c) || c == ' ' || c == '\'') {
                out.append(c);
            }
        }
        return out.toString();
    }

    public static void main(String[] args) throws IOException {
        String fullText = "";
        Scanner sc = new Scanner(new File("src\\tut11\\story2.txt"));
        while (sc.hasNext()) {
            fullText += sc.nextLine() + " ";
        }
        fullText = removePuctuations(fullText);
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
