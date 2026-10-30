package Day11;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();

        set.add("Phoebe");
        set.add("Ursula");
        set.add("Joey");
        set.add("Gunther");

        Iterator itr = set.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

	}
	}

}
