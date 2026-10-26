package Day8;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[] rollNumbers = new int[6];

        for (int i = 0; i < rollNumbers.length; i++) {
            rollNumbers[i] = sc.nextInt();
        }

        int searchNumber = sc.nextInt();
        int position = -1;

        for (int i = 0; i < rollNumbers.length; i++) {
            if (rollNumbers[i] == searchNumber) {
                position = i + 1;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Roll Number Found");
            System.out.println("Position: " + position);
        } else {
            System.out.println("Roll Number Not Found");
        }

	}

}
