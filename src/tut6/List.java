package tut6;

public class List {
    int[] els; // array of elements

    public List() {
        els = new int[0];
    }

    public void add(int n) {
        int[] b = new int[size() + 1];
        for (int i = 0; i < size(); i++) {
            b[i] = els[i];
        }
        b[size()] = n;
        els = b;
    }

    public void remove(int index) {
        int[] b = new int[size() - 1];
        for (int i = 0; i < b.length; i++) {
            if (i < index) {
                b[i] = els[i];
            } else {
                b[i] = els[i + 1];
            }
        }
        els = b;
    }

    public int get(int index) {
        return els[index];
    }

    public int size() {
        return els.length;
    }
}
