package tut1;

public class JPYConvert {
    public static void main(String[] args) {
        int vnd = 1000000;
        int rate = 207;
        int jpy = vnd / rate;
        System.out.println(vnd + " VND is roughly " + jpy + " JPY.");
    }
}
