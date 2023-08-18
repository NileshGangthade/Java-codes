// Java Program to Demonstrate
// Implementation of LinkedList
// class

// Importing required classes
import java.util.*;
import java.util.LinkedList;

// Main class
public class Link {
		//LinkedHashMap<String, String> hm2 = new LinkedHashMap<>();
	public static LinkedList<String> ll2 = new LinkedList<>();



	public static void searchElement(LinkedList<String> ll2, String s){

		for (int i=0; i<ll2.size(); i++){
			if (s == ll2.get(i)){
				System.out.println("found element at index : "+i);
			}
		}
	}
	// Driver code
	public static void main(String args[])
	{
		//hm2.put("sanket", "Object");
		// Creating object of the
		// class linked list
		//ArrayList<String> ll = new ArrayList<String>();
		//List<String> li2 = new LinkedList<>();
		ll2.add(0,"sanekt");
		ll2.add( 1,"ram");
		ll2.add(2, "b");
		ll2.add(ll2.size (), "a");
		ll2.addLast("null");
		ll2.add(1, null);
		ll2.remove(0);
		ll2.get(2);
		
		//LinkedList<String> ll2 = new LinkedList<>();
		
	    if(ll2.isEmpty()){
			System.out.println("ll2.size();");
		}
		

		System.out.println(ll2);
		System.out.println(ll2.size());

		searchElement(ll2, "a");
	}
}
