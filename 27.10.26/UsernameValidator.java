package Day9;

import java.util.Scanner;

public class UsernameValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String username = sc.nextLine();

	        System.out.println("Username: " + username);
	        System.out.println("Length: " + username.length());

	        if (username.contains(" ")) {
	            System.out.println("Contains spaces: Yes");
	        } else {
	            System.out.println("Contains spaces: No");
	        }

	        if (username.length() >= 5 && !username.contains(" ")) {
	            System.out.println("Username status: Valid");
	        } else {
	            System.out.println("Username status: Invalid");
	        }

	}

}
