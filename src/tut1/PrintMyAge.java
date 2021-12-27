package tut1;

public class PrintMyAge {
    public static void main(String[] args) {
        int thisYear = 2021;
        int yearOfBirth = 1990;
        System.out.println("I was born in " + yearOfBirth + ". This year is " + thisYear + ".");
        System.out.println("Therefore, my age is:");
        System.out.println(thisYear - yearOfBirth);
    }
}
