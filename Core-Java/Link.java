// Java Program to Demonstrate
// Implementation of LinkedList
// class

// Importing required classes
import java.util.*;
import java.util.LinkedList;

// Main class
public class Link {
		//LinkedHashMap<String, String> hm2 = new LinkedHashMap<>();
	public static LinkedList<Integer> ll2 = new LinkedList<>();



	public static void searchElement(LinkedList<String> ll2, String s){

		for (int i=0; i<ll2.size(); i++){
			if (s == ll2.get(i)){
				System.out.println("found element at index : "+i);
				return;
				
			}

		}

		System.out.println("Element are not found in ll2");

	}
	public static void printLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" NULL");
    }
    
	// Driver code
	public static void main(String args[])
	{
		//hm2.put("sanket", "Object");
		// Creating object of the
		// class linked list
		//ArrayList<String> ll = new ArrayList<String>();
		//List<String> li2 = new LinkedList<>();
		
		//ll2.sort(null);
		
		//LinkedList<String> ll2 = new LinkedList<>();
		
	    // if(ll2.isEmpty()){
		// 	System.out.println("ll2.size();");
		// }
		
		

		
		ll2.add(0, 3);
		ll2.add(1, 1);
		ll2.add(2, 5);
		ll2.add(3, 4);
		ll2.add(4, 6);
		ll2.add(5, 2);
		//System.out.println(ll2.size());
		//System.out.println(ll2.get((ll2.size()-1)/2));
		//System.out.println(ll2.pop());
		System.out.println(ll2);
		//ll2.remove(3);
			printLinkedList(ll2);
		Collections.sort(ll2);
		System.out.println(ll2);
		printLinkedList(ll2);

		

		//searchElement(ll2, "ahj");

	}
}
