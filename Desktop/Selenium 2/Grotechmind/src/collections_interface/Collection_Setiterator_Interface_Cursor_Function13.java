package collections_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Setiterator_Interface_Cursor_Function13 {

	public static void main(String[] args) {
		Set s1=new HashSet();
		s1.add(20);
		s1.add(30);
		s1.add(30);
		s1.add(40);
		s1.add(40);
		s1.add(null);
		s1.add(null);
		//System.out.println(s1);
		
Iterator i1=s1.iterator();
while(i1.hasNext())	
{	
System.out.println(i1.next());
}
	}

}
