package Assignment_java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Upcastingdemo 
{
public static void main(String[] args)
{
	
	@SuppressWarnings("rawtypes")
	List<Comparable> li=new ArrayList<Comparable>();//upcasting converting child class object to super class type
	li.add(123);
	li.add(345);
	li.add("hello");
	li.add(43.54);
	li.add(null);
	li.add("true");
	li.add(null);
	
	System.out.println(li);
	//Iterator is a return type for holding iterator() method.
	@SuppressWarnings("rawtypes")
	Iterator<Comparable> ii=li.iterator();
	while(ii.hasNext())//return boolean
		
	{
		System.out.println(ii.next());//return object
	}
	System.out.println(li.get(2));
	System.out.println(li.remove(2));
	System.out.println("after removing my list is:"+li);
	// using ListIterator
	System.out.println("using listiterator return type");
	@SuppressWarnings("rawtypes")
	ListIterator<Comparable> lii=li.listIterator();
	while(ii.hasNext())
	{
		System.out.println(lii.next());
	}
	
	System.out.println("reverse printing of list elements");
	while(lii.hasPrevious());//return object
}
}	
	
	
	

