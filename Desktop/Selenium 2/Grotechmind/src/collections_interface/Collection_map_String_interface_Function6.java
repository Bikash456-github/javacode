package collections_interface;

import java.util.HashMap;
import java.util.Map;

public class Collection_map_String_interface_Function6 {

	public static void main(String[] args) {
    Map<String,String> m1=new HashMap<String,String>()	;	
		m1.put("ram", "pokhara");
		m1.put("hari", "nepal");
		m1.put("krishna", "kathmandu");
		m1.put("kamala", "cart");
		System.out.println(m1);
		
		 Map<String,String> m2=new HashMap<String,String>()	;	
			m2.put("hari2", "safalta");
			m2.put("Krishna2", "pokharanepal");
			m2.put("pokharanepal", "nepal5");
			m2.put("usa", "trump");
			System.out.println(m2);	
			//boolean m3=m1.equals(m2);
			//System.out.println(m3);
			m2.putAll(m1);
			
		
	}

}
