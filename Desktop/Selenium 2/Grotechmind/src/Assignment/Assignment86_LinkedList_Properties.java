package Assignment;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment86_LinkedList_Properties {
public static void main(String[] args) {
	LinkedList<Integer>lList=new LinkedList<Integer>();
	lList.add(123);
	lList.add(235);
	lList.add(12);
	lList.add(1);
	lList.add(123);
	
	System.out.println(lList);
	Collections.sort(lList);
	System.out.println("After sort"+lList);
	
	Iterator<Integer> it_lList=lList.iterator();
	System.out.println(("****Iterator has Next"));
	while(it_lList.hasNext()) 
	{
		
	System.out.println(it_lList.next());
	ListIterator<Integer>it_lList1=lList.listIterator();
	while(it_lList1.hasNext())
	{
	System.out.println(it_lList1.next());
	
}
	System.out.println("*****ListIterator hasprevious****");
while(it_lList1.hasPrevious())
{
	System.out.println(it_lList1.previous());
	
	}
}}}