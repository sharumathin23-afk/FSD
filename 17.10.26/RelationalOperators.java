package Day3;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        RelOp rel = new RelOp();
        
        System.out.println(rel.eq(a, b));
        System.out.println(rel.gt(a, b));
        System.out.println(rel.lt(a, b));
        System.out.println(rel.ne(a, b));

	}

}
class RelOp{
	public boolean eq(int a, int b){
		return a==b;
	}
	public boolean gt(int a, int b){
		return a>b;
	}
	public boolean lt(int a, int b){
		return a<b;
	}
	public boolean ne(int a, int b){
		return a!=b;
	}
}
