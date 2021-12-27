package tut2;

public class CoinConverterC {
    public static void main(String[] args) {
        int a = 651246;
        int xu = a % 10;
        int hao = a / 10 % 10;
        int dong = a / 100 % 100;
        int quan = a / 10000;
        System.out.println(quan + " quan, " + dong + " dong, " + hao + " hao, " + xu + " xu.");
    }
}
