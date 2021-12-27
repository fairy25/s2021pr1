package tut2;

public class CoinConverterA {
    public static void main(String[] args) {
        int a = 483274; // the starting number of xu
        System.out.println(a + " xu is:");
        int x = a % 10;
        a = a / 10; // total number of hao
        int h = a % 10;
        a = a / 10; // total number of dong
        int d = a % 100;
        int q = a / 100; // total number of quan
        System.out.println(q + " quan, " + d + " dong, " + h + " hao, " + x + " xu.");
    }
}
