package Assignment_java;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteratordemo {
public static void main(String[] args) {
	
	List<Integer> li=new ArrayList<Integer>();//write this 1 set then import as it is object
	li.add(12);
	li.add(13);
	Iterator<Integer> m1=li.iterator();
	while (m1.hasNext())
	{
		System.out.println(m1.next());	
		}
	System.out.println("using list Iterator:");
		ListIterator<Integer> i2 =     li.listIterator();
	 while(i2.hasNext()) {
		 System.out.println(i2.next());
	 }
	while(i2.hasPrevious())
	{
		System.out.println(i2.previous());
	}
	
	
	
}}
