package Basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class RemovingDuplicatesFromAlist {
	
	public static void main(String[] args) {
		ArrayList<String> Al= new ArrayList<>();
		Al.add("shiva");
		Al.add("goutham");
		Al.add("shiva");
		Al.add("amit");
		Al.add("raj");
		
		
		System.out.println("Collection with duplicates Arraylist ");
		System.out.println(Al);
		System.out.println(" ");
		System.out.println("***********************************************");
		
		HashSet<String> h= new HashSet<String>(Al);
		System.out.println(" ");
		System.out.println("Collection without duplicates  HashSet");
		System.out.println(h);
		System.out.println("***********************************************");
		
		System.out.println("Collection With  Natural Sorting");
		TreeSet<String> T= new TreeSet<>(h);
		System.out.println(T);
		System.out.println("*********************************");
		System.out.println("Operation with linked list");
		LinkedList<String> L= new LinkedList(Al);
	    L.addFirst("azar");
		System.out.println(L);
		System.out.println("");
		System.out.println("*********************Linked HashSet*********************");
		LinkedHashSet<String> LH = new LinkedHashSet<>(Al);
		System.out.println(LH);
		
		
	}
	
}
