package tut2;

public class FloatNumberC {
    public static void main(String[] args) {
        double n = 10;
        System.out.print("(" + n + ") ");
        if (n == 0) {
            System.out.println("The number is zero.");
        } else {
            double abs = n;
            String polarity = "positive", nSize = "";
            if (n < 0) abs = -n;
            if (n < 0) polarity = "negative";
            if (abs < 1) nSize = " small";
            if (abs > 1000000) nSize = " large";
            System.out.println("A" + nSize + " " + polarity + " number.");
        }
    }
}
