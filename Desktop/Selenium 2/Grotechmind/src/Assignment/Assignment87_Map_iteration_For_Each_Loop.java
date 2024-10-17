package Assignment;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Assignment87_Map_iteration_For_Each_Loop {

	public static void main(String[] args) 
	{
	
		Map<Integer, String> m1=new HashMap<Integer, String>();
   m1.put(123, "BIKASH");
   m1.put(127, "Dhungana");
   m1.put(129, "Sarmila");
   m1.put(125, "Subedi");
		System.out.println(m1);
		//{129=Sarmila, 123=BIKASH, 125=Subedi, 127=Dhungana}
		System.out.println("--Map keys Iteration using keySet---");
		for (Integer i1:m1.keySet())
		{
		System.out.println(i1);
	}
System.out.println("---Map values Iteration using values---");
for(String s1:m1.values())
{
	System.out.println(s1);
}
System.out.println("----Map Iteration using entrySet----");
for(Entry<Integer,String>e1:m1.entrySet()) {
	System.out.println(e1);
}}}