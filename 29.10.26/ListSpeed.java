package Day11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 100000; i++) {
            list.add("Sharu");
            list.add("Mathi");
            list.remove(0);
        }

        System.out.println("Time taken by ArrayList: " +
                (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();

        LinkedList<String> ll = new LinkedList<String>();

        for (int i = 0; i < 100000; i++) {
            ll.add("Sharu");
            ll.add("Mathi");
            ll.remove(0);
        }

        System.out.println("Time taken by LinkedList: " +
                (System.currentTimeMillis() - startTime) + "ms");

	}

}
