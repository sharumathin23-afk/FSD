package Day11;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set = new HashSet<>();

	        set.add("Joey");
	        set.add("Rachel");
	        set.add("Ross");
	        set.add("Monica");

	        Iterator<String> itr = set.iterator();

	        while (itr.hasNext()) {

	            System.out.println(itr.next());

	        }

	}

}
