package tut6;

public class BankAccount {
    String name;
    double balance;
    double interestRate;
    int transactions;

    public BankAccount(String n, double initial, double r) {
        name = n;
        interestRate = r;
        transact(initial, "first deposit");
        transactions = 1;
    }

    public void transact(double amount, String content) {
        balance += amount;
        transactions++;
        String log = "(" + name + ") ";
        if (amount < 0) {
            log += "-$" + String.format("%.2f", -amount);
        } else {
            log += "+$" + String.format("%.2f", amount);
        }
        log += ", reason: " + content;
        System.out.println(log);
    }

    public void deposit(double amount) {
        transact(amount, "deposit");
    }

    public void withdraw(double amount) {
        transact(-amount, "withdraw");
    }

    public void monthlyFee() {
        transact(-10, "monthly fee payment");
    }

    public void annualInterest() {
        double interest = balance * interestRate / 100;
        transact(interest, "annual interest");
    }

    public String toString() {
        String out = name + ", ";
        if (balance < 0) {
            out += "-$" + String.format("%.2f", -balance);
        } else {
            out += "$" + String.format("%.2f", balance);
        }
        return out;
    }

    public void transfer(BankAccount target, double amt) {
        double fee = 0.5, total = amt + fee;
        if (total > balance) {
            System.out.println("Cannot transfer, not enough money!");
        } else {
            transact(-total, "transfer to " + target.name + "'s account + fee");
            target.transact(amt, "receive money from " + name + "'s account");
        }
    }
}
