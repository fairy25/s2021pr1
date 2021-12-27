package tut4;

public class Fibonacci {
    public static void main(String[] args) {
        int p2 = -1;
        int p1 = 1;
        for (int i = 0; i < 10; i++) {
            int fibo = p2 + p1;
            System.out.print(fibo + " ");
            p2 = p1;
            p1 = fibo;
        }
    }
}
/*
		arList = {"odd", "even", "evenv2", "abc"}

		for (int i = 0; i < arList.size(); i++) {
			if (arList.get(i).length() % 2 == 0) {
				arList.remove(i);
			}
		} // incorrect solution
		// how it works:
		// i = 0
		arList.get(0) is "odd", length() is 3, so not doing anything
		// i = 1
		arList.get(1) is "even", length() is 4, so remove it
		--> {"odd", "evenv2", "abc"}
		// i = 2
		arList.get(2) is "abc", length() is 3, so not doing anything

		// should be:
		for (int i = 0; i < arList.size(); i++) {
			if (arList.get(i).length() % 2 == 0) {
				arList.remove(i);
				i--;
			}
		}
		// how it works:
		// i = 0
		arList.get(0) is "odd", length() is 3, so not doing anything
		// i = 1
		arList.get(1) is "even", length() is 4, so remove it
		arList --> {"odd", "evenv2", "abc"}, i --> 0
		// i = 1
		arList.get(1) is "evenv2", length() is 4, so remove it
		arList --> {"odd", "abc"}, i --> 0
		// i = 1
		arList.get(1) is "abc", length() is 3, so not doing anything
		// i = 2
		loop stops because i < arList.size() is false

		// alternatively:
		for (int i = arList.size() - 1; i >= 0; i--) {
			if (arList.get(i).length() % 2 == 0) {
				arList.remove(i);
			}
		}
		// how it works:
		// i = 3
		arList.get(3) is "abc", length() is 3, so not doing anything
		// i = 2
		arList.get(2) is "evenv2", length() is 6, so remove it
		arList --> {"odd", "even", "abc"}
		// i = 1
		arList.get(1) is "even", length() is 4, so remove it
		arList --> {"odd", "abc"}
		// i = 0
		arList.get(0) is "odd", length() is 3, so not doing anything
		// i = -1
		loop stops because i >= 0 is false now
*/