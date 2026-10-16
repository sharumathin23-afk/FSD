package fundamentals;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18){
			System.out.println(" ELigible to vote ");
		}
		else{
			System.out.println(" Not ELigible to vote");
		}
	}

}
