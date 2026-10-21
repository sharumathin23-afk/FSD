package Day4;

public class BankClass {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.display();

        CurrentAccount c = new CurrentAccount();
        c.display();
    }
}

class BankAccount {
    int accountNumber;
    int balance;
}

class SavingsAccount extends BankAccount {
    void display() {
        accountNumber = 1001;
        balance = 25000;

        System.out.println("Savings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class CurrentAccount extends BankAccount {
    void display() {
        accountNumber = 1002;
        balance = 50000;

        System.out.println("\nCurrent Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

