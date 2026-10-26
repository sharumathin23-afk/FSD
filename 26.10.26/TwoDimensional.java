package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
        	for(int j=0;j<r;j++){
        	arr[i][j]=sc.nextInt();
        	}
        }
        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

	}

}
