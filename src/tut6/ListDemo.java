package tut6;

public class ListDemo {
    public static void main(String[] args) {
        List l1 = new List();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        l1.remove(1);
        System.out.print("After remove: ");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }

    }
}
