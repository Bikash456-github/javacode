package collections_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_map_keyset_value_interface_Function9 {

	public static void main(String[] args) {
	Map<Integer,String >m1=new HashMap<Integer,String>();
		m1.put(456, "ram");
		m1.put(567, "shyam");
		m1.put(987, "Anil");
		//System.out.println(m1);
		
	Set<Entry<Integer,String>>s2 =m1.entrySet();
		Iterator<Entry<Integer,String>>i1=s2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		
		
		
		
		
		
		
		for(Entry<Integer,String>e1:m1.entrySet())
		{
			System.out.println(e1);
		}
		for( String s3:    m1.values())
		{
			System.out.println(s3);
		}
		
		for( Integer s4:    m1.keySet())
		{
			System.out.println(s4);
		}
		
		
		

	}

}
