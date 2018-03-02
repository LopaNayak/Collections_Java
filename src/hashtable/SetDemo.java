package hashtable;
import java.util.Set;
import java.util.HashSet;

public class SetDemo {
	
	private static void HashSetDemo(){
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("YELLOW");
		set1.add("PINK");
		set1.add("YELLOW");
		System.out.println(set1);
		//The third item is not added as it is a duplicate
		
		
		
	}
	
	public static void main(String args[])
	{
		HashSetDemo();
	}

}
