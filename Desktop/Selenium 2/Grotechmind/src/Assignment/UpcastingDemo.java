package Assignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class UpcastingDemo {

	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		List<Comparable> li =new ArrayList<Comparable>(); //upcasting convertign child class obj to super class type
		li.add(123);
		li.add("hello");
		li.add('c');
		li.add("true");
		li.add(12.34);
		li.add(null);
		li.add(null);
		System.out.println(li);
		//Iterator is a return type for holding iterator()  method.
		
		@SuppressWarnings("rawtypes")
		Iterator<Comparable> ii=li.iterator();  //iterator method returnstype hold by Iterator to hold that datatype.
		
		while(ii.hasNext())    //returns boolean 
		{
			System.out.println(ii.next());  //returns object
		}
		System.out.println(li.get(2));
		System.out.println(li.remove(2));
		System.out.println("after removing my list is:"+li);
		
		//using listIterator 
		System.out.println("*****using ListIterator return type******");
		@SuppressWarnings("rawtypes")
		ListIterator<Comparable> lii= li.listIterator();
		while(lii.hasNext())
		{
			System.out.println(lii.next());
		}
		
		System.out.println("*****reverse printling of list elements******");
		while(lii.hasPrevious())  //returns boolean value
		{
			System.out.println(lii.previous());  //returns object
		}
		
		
		
				
	}

}


