package Day11;

import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();

        ll.add("Sharu");
        ll.add("Mathi");
        ll.add("Neela");
        ll.add("Brownie");
        ll.add("Seetha");
        ll.add("Shreyansh");
        ll.add("Vignesh");
        ll.add("Vasu");
        ll.add("Jeya");
        ll.add("Gayathri");

        System.out.println("Initial list: " + ll);

        ll.remove("Neela");

        System.out.println("After remove(object): " + ll);

        ll.remove(0);

        System.out.println("After remove(index): " + ll);

        LinkedList<String> ll2 = new LinkedList<>();

        ll2.add("Rashi");
        ll2.add("Harsh");

        ll.addAll(ll2);

        System.out.println("After addAll(): " + ll);

        ll.removeAll(ll2);

        System.out.println("After removeAll(): " + ll);

        ll.removeFirst();

        System.out.println("After removeFirst(): " + ll);

        ll.removeLast();

        System.out.println("After removeLast(): " + ll);

        ll.removeFirstOccurrence("Vignesh");

        System.out.println("After removeFirstOccurrence(): " + ll);

        ll.removeLastOccurrence("Harsh");

        System.out.println("After removeLastOccurrence(): " + ll);

        ll.clear();

        System.out.println("After clear(): " + ll);

	}

}
