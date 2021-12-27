package tut7;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This is the implementation of exercise P7.5
 * From the book Big Java (7e, 2019) by Cay S. Horstmann
 */
public class BulgarianSolitaire {
    String name;
    public static boolean checkFinalConfig(ArrayList<Integer> piles) {
        if (piles.size() != 9) return false;
        int[] check = new int[9];
        for (int p : piles) {
            if (p < 10) check[p - 1] = 1;
        }
        // the game ends when all values of check are 1
        for (int c : check) {
            if (c != 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int initPiles = (int) (Math.random() * 4) + 3;
        System.out.println(initPiles);
        int total = 45;
        Integer[] pp = new Integer[initPiles];
        int d = (total - initPiles) / initPiles + 1;
        for (int i = 0; i < initPiles; i++) {
            pp[i] = 1;
            pp[i] += (int) (Math.random() * d);
            total -= pp[i];
        }
        pp[0] += total;
        ArrayList<Integer> piles = new ArrayList<>();
        for (int p : pp) {
            piles.add(p);
        }
        // done generating initial piles
        while (!checkFinalConfig(piles)) {
            // collect 1 card from each pile
            int collect = piles.size();
            for (int i = piles.size() - 1; i >= 0; i--) {
                if (piles.get(i) == 1) piles.remove(i);
            }
            for (int i = 0; i < piles.size(); i++) {
                piles.set(i, piles.get(i) - 1);
            }
            piles.add(collect);
            for (int p : piles) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
