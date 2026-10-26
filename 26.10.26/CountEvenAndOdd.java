package Day8;

import java.util.Scanner;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[] numbers = new int[8];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Numbers Count: " + even);
        System.out.println("Odd Numbers Count: " + odd);

	}

}
