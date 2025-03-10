package collections_interface;

import java.util.HashMap;
import java.util.Map;

public class Collection_map_Integer_interface_Function7 {

	public static void main(String[] args) {
	    Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Bikash", 234);
		m1.put("ram", 567);
		m1.put("hari",786);
		System.out.println(m1);
	  
      Map<String,Integer> m2=new HashMap<String,Integer>();
		m2.put("Dhungana", 24);
		m2.put("marvin", 57);
		m2.put("tulachan",76);
		//System.out.println(m2);	
		//m2.putAll(m1);
	boolean m4=m2.equals(m1);
	 System.out.println(m4);

	}

}
