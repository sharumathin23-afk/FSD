package Day3;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        ArithOp ap = new ArithOp();
        ap.add(a, b);
        ap.sub(a, b);
        ap.mul(a, b);
        ap.div(a, b);
        ap.mod(a, b);

	}

}
class ArithOp{
	public void add(int a, int b){
		System.out.println("Addition : "+ (a+b));
	}
	public void sub(int a, int b){
		System.out.println("Subraction : "+ (a-b));
	}
	public void mul(int a, int b){
		System.out.println("Multiplication : "+ (a*b));
	}
	public void div(int a, int b){
		System.out.println("Division : "+ (a/b));
	}
	public void mod(int a, int b){
		System.out.println("Modulus : "+ (a%b));
	}
}