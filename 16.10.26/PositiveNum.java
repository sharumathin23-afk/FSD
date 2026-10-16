package fundamentals;

import java.util.Scanner;

public class PositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=0){
			System.out.println(a+" is a positive number");
		}
		else{
			System.out.println(a+" is not a positive number");
		}

	}

}
