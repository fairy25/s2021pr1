package tut6;

public class FactorPrinter {
    public static void main(String[] args) {
        FactorGenerator fg = new FactorGenerator(736200);
        // how to print out all factors?
        // iteration pattern
        while (fg.hasMoreFactors()) {
            System.out.println(fg.nextFactor());
            // nextFactor() reduces n each time it runs
            // eventually, n will be reduced to 1
            // which makes hasMoreFactors() return false
            // which makes the while loop stop
        }
    }
}
