package collections_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_map_keyset_value_interface_Function11 {

	public static void main(String[] args) {
		 Map<String,String> m1=new HashMap<String,String>()	;	
			m1.put("GMT12", "ANU");
			m1.put("GMT13", "RADHIKA");
			m1.put("GMT14", "VAIBHAV");
			m1.put("GMT15", "KARISHMA");

	Set<Entry<String,String>> p1=m1.entrySet();//the return type of entry set is Set of entry key and value
	Iterator<Entry<String,String>>i1	=	p1.iterator();
		while(i1.hasNext())	
		{
			System.out.println(i1.next());
		}	
			
	}

}
