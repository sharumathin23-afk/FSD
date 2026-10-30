package Day11;

import java.util.LinkedList;

public class LinkedListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();

        System.out.println("Initial list: " + ll);

        ll.add("Sharu");
        ll.add("Mathi");
        ll.add("Neela");

        System.out.println("After add(): " + ll);

        ll.add(1, "Vasu");

        System.out.println("After add(index): " + ll);

        LinkedList<String> ll2 = new LinkedList<>();

        ll2.add("Shreyansh");
        ll2.add("Jeya");

        ll.addAll(ll2);

        System.out.println("After addAll(): " + ll);

        LinkedList<String> ll3 = new LinkedList<>();

        ll3.add("Gayathri");
        ll3.add("Seetha");

        ll.addAll(1, ll3);

        System.out.println("After addAll(index): " + ll);

        ll.addFirst("Vignesh");

        System.out.println("After addFirst(): " + ll);

        ll.addLast("Brownie");

        System.out.println("After addLast(): " + ll);

	}

}
