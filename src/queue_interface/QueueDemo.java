package queue_interface;
import java.util.ArrayDeque;
import java.util.Deque;
/** AIM: arraydeque implements a FIFO data structure of Queue.
 * 
 * 	add()
 * 	remove()
 *  removeFirst()
 *  push()
 *  pop()
 * 
 * 
 * */

public class QueueDemo {
	
	private static void dequeTest(){
		System.out.println("\n Inside queueDemo");
		
		Deque<String> deque = new ArrayDeque<>();
		//replace arrayDeque with LL, same output. However, Arraydeque has better performance
		//Deque<String> linkList = new LinkedList<>();
		deque.add("Jane eyre");
		deque.add("Wizard of OZ");
		deque.add("Effective Java");
		
		System.out.println("\n printing the queue");
		System.out.println(deque.remove()); // remove element from HEAD and returns the removed element.
		System.out.println(deque.remove()); // remove() from HEAD is same is removeFirst()
		System.out.println(deque.remove());
		
		//stack push
		deque.push("Jane eyre");
		deque.push("Wizard of Oz");
		deque.push("Effective Java");
		
		System.out.println("\n printing the queue");
		System.out.println(deque.pop());
		
	}
	public static void main(String args[])
	{
		dequeTest();
	}

}
