package Day8;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Array15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 1, 2, 3, 4, 5 };
		int[] removed = ArrayUtils.removeElement(intArray, 3);
		System.out.println(Arrays.toString(removed));
	}

}
