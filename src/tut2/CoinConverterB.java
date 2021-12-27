package tut2;

public class CoinConverterB {
    public static void main(String[] args) {
        double a = 837468;
        double quan = Math.floor(a / 10000);
        double dong = Math.floor(a / 100 - quan * 100);
        double hao = Math.floor(a / 10 - quan * 1000 - dong * 10);
        double xu = a - hao * 10 - dong * 100 - quan * 10000;
        System.out.println(quan + " quan, " + dong + " dong, " + hao + " hao, " + xu + " xu.");
    }
}
