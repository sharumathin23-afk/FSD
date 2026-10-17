package Day3;

import java.util.Scanner;

public class AssignmentOperators {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Initial Balance:");
	        int balance = sc.nextInt();

	        AssOp as = new AssOp();

	        balance = as.Deposit(balance);
	        balance = as.Withdrawal(balance);

	        sc.close();
	    }
	}

	class AssOp {
	    public int Deposit(int balance) {
	        balance += 1500;
	        System.out.println("After Deposit: " + balance);
	        return balance;
	    }

	    public int Withdrawal(int balance) {
	        balance -= 1000;
	        System.out.println("After Withdrawal: " + balance);
	        return balance;
	    }
	}