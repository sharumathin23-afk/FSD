package fundamentals;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        char ch = sc.next().charAt(0);
        switch(ch){
        case '+':
        	System.out.println("Addition: "+(a+b));
        	break;
        case '-':
        	System.out.println("Subraction: "+(a-b));
        	break;
        case '*':
        	System.out.println("Multiplication: "+(a*b));
        	break;
        case '/':
        	System.out.println("Division: "+(a/b));
        	break;
        }
	}

}
