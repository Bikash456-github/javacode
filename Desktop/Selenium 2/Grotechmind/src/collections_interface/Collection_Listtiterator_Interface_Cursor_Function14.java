package collections_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_Listtiterator_Interface_Cursor_Function14 {

	public static void main(String[] args) {
		List s1=new ArrayList();//accept dublicate
		s1.add(20);
		s1.add(30);
		s1.add(30);
		s1.add(40);
		s1.add(40);
	
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
        ListIterator i2=	s1.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i2.hasNext());
			
		}
		  ListIterator i3=	s1.listIterator();
			while(i3.hasPrevious())
			{
		System.out.println(i2.hasPrevious());
				
	}

}}
