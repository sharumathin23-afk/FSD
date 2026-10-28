package Day9;

import java.util.Scanner;

public class EmailDomainExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();

        int pos = email.indexOf("@");

        String username = email.substring(0, pos);
        String domain = email.substring(pos + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

	}

}
