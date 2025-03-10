package Assignment_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map_interface {
public static void main(String[] args) {
	
	Map<Integer,String>m1=new HashMap<Integer,String>();
	m1.put(3456, "rakesh");
	m1.put(4582, "sammar");
	m1.put(7450, "bikash");
	m1.put(56934, "Sarmila");
	Set<Entry<Integer,String>> s2=m1.entrySet();
	@SuppressWarnings("unused")
	Iterator<Entry<Integer,String>> i1  =  s2.iterator();
	
	
	
	
}
}
