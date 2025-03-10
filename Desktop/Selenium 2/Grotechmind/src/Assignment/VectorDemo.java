package Assignment;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo
{ 
	public static void main(String args[]){  
	Vector<String> v=new Vector<String>();  
	v.add("A");  
	v.add("BB");  
	v.add("CCC");  
	v.add("DDDD");  
	Iterator<String> itr=v.iterator();  
	
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	
	@SuppressWarnings("rawtypes")
	ListIterator lii=v.listIterator();
	System.out.println("using  Listiterator");
	
	while(lii.hasNext())
	{  
		System.out.println(lii.next());  
	} 
	System.out.println("printing reverse order of elements");
	while(lii.hasPrevious())
	{  
		System.out.println(lii.previous());  
	} 
	System.out.println("enumerator to be implemented");
	
	for (Enumeration<String> e = v.elements(); e.hasMoreElements();)
	       System.out.println(e.nextElement());
}  
}  
	
}  