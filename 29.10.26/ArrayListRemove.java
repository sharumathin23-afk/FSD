package Day11;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

        al.add("Sharu");
        al.add("Mathi");
        al.add("Chandler");
        al.add("Joey");
        al.add("Phoebe");

        System.out.println("Initial list: " + al);

        al.remove("Mathi");

        System.out.println("After remove(object): " + al);

        al.remove(0);

        System.out.println("After remove(index): " + al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("Ross");
        al2.add("Rachel");

        al.addAll(al2);

        System.out.println("Updated list: " + al);

        al.removeAll(al2);

        System.out.println("After removeAll(): " + al);

        al.removeIf(str -> str.contains("Sharu"));

        System.out.println("After removeIf(): " + al);

        al.clear();

        System.out.println("After clear(): " + al);

	}

}
