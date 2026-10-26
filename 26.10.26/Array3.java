package Day8;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};

        int index = Arrays.binarySearch(arr, 30);

        System.out.println("Index: " + index);
	}

}
