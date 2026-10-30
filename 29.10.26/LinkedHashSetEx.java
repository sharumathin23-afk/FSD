package Day11;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Chandler");
        set.add("Joey");
        set.add("Monica");
        set.add("Phoebe");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

        }

	}

}
