package tut2;

public class BMI {
    public static void main(String[] args) {
        double w = 51.0;
        double h = 1.63;
        double bmi = w / (h * h);
        System.out.println("My weight: " + w + " (kg)");
        System.out.println("My height: " + h + " (m)");
        System.out.println("My BMI: " + bmi + " (kg/m2)");
    }
}
