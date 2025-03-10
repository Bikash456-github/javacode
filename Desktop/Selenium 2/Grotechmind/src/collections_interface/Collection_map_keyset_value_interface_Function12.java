package collections_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collection_map_keyset_value_interface_Function12 {
public static void main(String[] args) {
	 Map<String,String> m1=new HashMap<String,String>()	;	
		m1.put("GMT12", "ANU");
		m1.put("GMT13", "RADHIKA");
		m1.put("GMT14", "VAIBHAV");
		m1.put("GMT15", "KARISHMA");
		System.out.println(m1);
		
		 for(String s1     :       m1.keySet())
		 {
			 System.out.println(s1);
		 }
		
		 for(String s2:m1.values())//interfaces are need to import because of java lang package
		 {
			 System.out.println(s2);
		 }
		
		 for(Entry<String, String> s3:m1.entrySet())//the return type of entry set is entry of key and value
		 {
			 System.out.println(s3);
		 }
		
		 
		 
		 
		 
		 
		 
}
}
