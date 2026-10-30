package Day11;

import java.util.ArrayList;

public class ArrayListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

        System.out.println("Initial list: " + al);

        al.add("Sharu");
        al.add("Mathi");
        al.add("Harini");

        System.out.println("After add(): " + al);

        al.add(1, "Devi");

        System.out.println("After add(index): " + al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("Shreyansh");
        al2.add("Vignesh");

        al.addAll(al2);

        System.out.println("After addAll(): " + al);

        ArrayList<String> al3 = new ArrayList<>();

        al3.add("Jeya");
        al3.add("Vasu");

        al.addAll(1, al3);

        System.out.println("After addAll(index): " + al);

	}

}
