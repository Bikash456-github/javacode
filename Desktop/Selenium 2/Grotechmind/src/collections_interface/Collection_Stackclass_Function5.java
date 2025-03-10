package collections_interface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Collection_Stackclass_Function5 {
public static void main(String[] args) {
	//class-1
	
	Stack a=new Stack();
	a.add(12);
	a.add(13);
	a.add(14);
	a.add(14);
	a.add("Bikash");
	a.add("Bikash");
	a.add(12);
	a.add(16);
	a.add(null);
	System.out.println(a);
	 // class -2
	Stack b=new Stack();
	b.add(100);
	b.add(130);
	b.add(140);
	b.add(140);
	b.add("Bikash");
	b.add("Bikash");
	b.add(12);
	System.out.println("After Sorting :"+b);
	System.out.println("iterator for class - b :");
	
	ListIterator i=b.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());	
	}
	while(i.hasPrevious())
	{	
     System.out.println(i.previous());
	}
	Stack b1=new Stack();
	b1.add(1308);
	b1.add(1404);
	b1.add(1430);
	b1.add("Bikash Dhg");
	b1.add("Bikash Dhg");
	System.out.println(b1);
Enumeration e1=	b1.elements(); //enumeration comes form vector class
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
}
}
