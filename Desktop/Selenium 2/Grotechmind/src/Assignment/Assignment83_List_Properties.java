package Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Assignment83_List_Properties {
public static void main(String[] args)
{
    List<Integer>aL=new ArrayList<Integer>();
	aL.add(20);
	aL.add(30);
	aL.add(40);
	aL.add(50);
	aL.add(60);
	aL.add(70);
	
	Iterator i1=aL.iterator();
	System.out.println("Fordward Iteration using iterator");
	while(i1.hasNext())
	{
	System.out.println(i1.next());	
}
	System.out.println("Fordward Iteration using listIterator");
	ListIterator i2=aL.listIterator();
	while(i2.hasNext())
	{
	System.out.println(i2.next());
	}
	System.out.println("Reserve Iteration using listIterator");
	while(i2.hasPrevious()) 
	{
	System.out.println(i2.previous());
	}
}}
