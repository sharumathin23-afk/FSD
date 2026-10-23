
package Day6;

public class AccManagement {

    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, "Sharu", 10000);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Initial Balance: " + b.getBalance());

        b.deposit(2000);
        b.withdraw(3000);

        System.out.println("Available Balance: " + b.getBalance());

        b.withdraw(15000);
    }
}

class BankAccount {
    private long accountNumber;
    private double balance;
    private String accountHolder;

    BankAccount(long accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolder = name;
        balance = bal;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Amount: " + amount);
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount > 0) {
            balance = balance - amount;
            System.out.println("Withdrawal Amount: " + amount);
        }
    }
}
