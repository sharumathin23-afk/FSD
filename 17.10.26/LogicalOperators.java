package Day3;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");
		int age = sc.nextInt();
		System.out.println("Enter mark :");
        int mark = sc.nextInt();
        LogOp rel = new LogOp();
        System.out.println("Eligible :");
        System.out.println(rel.eq(age, mark));

	}

}
class LogOp{
	public boolean eq(int age, int mark){
		return age>=18 && mark>=50;
	}
	
}
