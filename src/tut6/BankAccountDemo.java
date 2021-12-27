package tut6;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Quan", 300.111111, 6.5);
        BankAccount acc2 = new BankAccount("John", 10, 6.9);
        acc.deposit(60);
        acc.withdraw(100);
        acc.annualInterest();
        acc.monthlyFee();
        acc.transfer(acc2, 20);
        System.out.println(acc);
    }
}
