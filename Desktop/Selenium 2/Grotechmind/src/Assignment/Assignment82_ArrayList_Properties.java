package Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class Assignment82_ArrayList_Properties {

	public static void main(String[] args) {
		ArrayList<Integer> aL=new ArrayList<Integer>();
	aL.add(20);
	aL.add(25);
	aL.add(65);
	aL.add(87);
	aL.add(56);
	aL.add(45);
	aL.add(77);
	aL.add(98);
	aL.add(56);
	System.out.println("Follows indexing ,null,full dublicate"+aL);
	Collections.sort(aL);
	System.out.println("After Sort"+aL);
	
	Iterator i1=aL.iterator();
	System.out.println("Fordward Iteration using listiterator");
	ListIterator i2=aL.listIterator();
	while(i2.hasNext())
	{
	System.out.println(i2.next());
	}
	System.out.println("Reverse Iteration using list Iterator");
	while(i2.hasPrevious())
	{
	System.out.println(i2.previous());
	}
}}
