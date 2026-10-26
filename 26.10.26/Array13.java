package Day8;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 1, 2, 3, 4, 5 };
		int[] intArray2 = { 6, 7, 8, 9, 10 };
		int a[] = ArrayUtils.addAll(intArray, intArray2);

		String s = Arrays.toString(a);

		System.out.println(s);
	}

}
