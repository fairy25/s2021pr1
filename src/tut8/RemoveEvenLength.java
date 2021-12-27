package tut8;

import java.util.ArrayList;

public class RemoveEvenLength {
    // this is possible because of call by reference
    public static void removeEvenLength(ArrayList<String> arrList) {
        for (int i = arrList.size() - 1; i >= 0; i--) {
            if (arrList.get(i).length() % 2 == 0) {
                arrList.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arList = new ArrayList<>();
        arList.add("odd");    // length = 3, keep
        arList.add("even");   // length = 4, remove
        arList.add("abc");    // length = 3, keep
        arList.add("abcd");   // length = 4, remove
        arList.add("abcde");  // length = 5, keep
        arList.add("abcdef"); // length = 6, remove
        removeEvenLength(arList);
        for (String s : arList) {
            System.out.println(s);
        }
    }
}
