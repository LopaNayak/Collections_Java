package list_interface;
import java.util.Collection;
import java.util.*;
import java.util.ArrayList;
public class ArrayListDemo {
	
	private static List<Integer> ALDemo()
	{
	// this assignment having refernce type as interface helps us in
	// giving max generality and enables us to switch implementation from AL to LL if needed.
	
	Collection<Integer> list1 = new ArrayList<>(); // need to invoke position specific methods
	// Add elements: AL allows null and duplicates too
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(4);
	list1.add(null);
	System.out.println("list1: " + list1);
	
	list1.remove(3);// Collection's remove method will remove the first object with value as 3, not the element with index =3
	
	System.out.println("list1: " + list1);
	
	System.out.println("Another AL object with List interface reference will be created now.");
	System.out.println("Demo for POSITIONAL operations");
	List<Integer> list2 = new ArrayList<>(); // need to invoke position specific methods
	// Add elements: AL allows null and duplicates too
	list2.add(1);
	list2.add(2);
	list2.add(3);
	list2.add(4);
	list2.add(null);
	System.out.println("list2: " + list2);
	
	list2.remove(3);// Collection's remove method will remove the first object with value as 3, not the element with index =3
	
	System.out.println("list2: " + list2);
	System.out.println("removing element in 3rd index position. "+list2.remove(3));
	System.out.println("list2: " + list2);
	list2.add(0, 10);
	System.out.println("list2: " + list2);
	list2.set(0, 9);
	System.out.println("list2: " + list2);
	
	System.out.println("Demo for BULK operations");
	Collection<Integer> list3 = new ArrayList<>();
	list3.add(9);
	list3.add(3);
	
	list2.removeAll(list3); //IF LIST2 has 9 and 3, remove them.
	System.out.println("list2: " + list2);
	
	list3.add(1);
	System.out.println("list3: " + list3);
	list2.retainAll(list3); // RetainALl() retain all elements in LIST3 that are common to LIST2 
							//and remove all others (non common)from LIST2. Nutshell - keeps only common elements.
	System.out.println("list2: " + list2);
	
	list2.addAll(list3);
	System.out.println("list2: " + list2);
	//set() in collection does not return void!!
	System.out.println("list2.set(2, 2): " + list2.set(2, 2));//SET() adds the element in the index specified, and also returns the value that was previously available at that location.
	System.out.println("list2: " + list2);
	/**/
	System.out.println("Demo for SEARCH operations");
	System.out.println("list2.contains(1): " + list2.contains(1));
	System.out.println("list2.indexOf(1): " + list2.indexOf(1)); // index no of first occurence of this element, or returns -1
	System.out.println("list2.lastIndexOf(1): " + list2.lastIndexOf(1));		
	System.out.println("list2: " + list2);
	
	//System.out.println("Demo for ITERATION operations");
	
	System.out.println("Demo for RANGE-VIEW operations");
	// Range-view: subList (new list is backed by original)
	List<Integer> list4 = list2.subList(2, 3);
	// When you make changes to list4, it reflects in the parent list2. 	
	System.out.println("list4: " + list4);
	list4.set(0, 6);// list4's 0 index position is mapped to list2's 2nd index position
	System.out.println("list2: " + list2);
	list4.add(0, 7);
	System.out.println("list2: " + list2);
	list2.set(2, 8);
	System.out.println("list4: " + list4);
	//list1.add(0, 8);
	//System.out.println("list3: " + list3);
	System.out.println("list2: " + list2);
			
			/*for (int element : list1) {
				System.out.println("element: " + element);
				
				// Generates ConcurrentModificationException
				if (element == 9) {
					list1.remove(Integer.valueOf(element)); // valueOf is used due to its caching
				}
			}*/
			
			return list2;
	
	}
/*	
	private static void iteratorDemo(List<Integer> list1) {
		System.out.println("\nInside iteratorDemo ... ");
				
		Iterator<Integer> iterator = list1.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.println("element: " + element);
			
			if (element == 9) {
				iterator.remove();
				iterator.forEachRemaining(Filter::add);	
			}
		}
		System.out.println("list1: " + list1);
		
		//list1.forEach(System.out::println);
		//list1.forEach(Filter::filter);
		//list1.forEach(new Filter());	// requires implementing Consumer	
		
		// forEachRemaining:
		// http://mail.openjdk.java.net/pipermail/lambda-dev/2013-June/010221.html
		// A/C Brian Goetz, he doesn't see much use of this method			
	}
	*/
	
	public static void main(String args[])
	{
		ArrayListDemo.ALDemo();
	}
}
