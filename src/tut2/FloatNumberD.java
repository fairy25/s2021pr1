package tut2;

public class FloatNumberD {
    public static void main(String[] args) {
        double d = -5000000;
        String polarity = " positive", howLarge = "";
        double a = d;
        if (d < 0) {
            polarity = " negative";
            a = -d;
        }
        if (a < 1) {
            howLarge = " small";
        } else if (a > 1000000) {
            howLarge = " large";
        }
        if (d == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("A" + howLarge + polarity + " number.");
        }
    }
}
