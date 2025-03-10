package Assignment_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Keyset {

	public static void main(String[] args) {
	Map<String,String>m1=new HashMap<String,String>()	;
		m1.put("GTM13", "josh");
		m1.put("GTM15", "sarmila");
		m1.put("GTM14", "BIKASH");
		m1.put("GTM 16", "raman");
		m1.put("GTM17", "saman");
		System.out.println(m1);
		Set<Entry<String,String>> p1=m1.entrySet();
		Iterator<Entry<String,String>> i1 = p1.iterator();
	while(i1.hasNext()) {
System.out.println(i1.next());
	}

}}
