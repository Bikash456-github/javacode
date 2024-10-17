package Assignment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
public class Assignment84_Set_Properties {
public static void main(String[] args) {
	Set<Integer>aL=new HashSet<Integer>();
	aL.add(10);
	aL.add(20);
	aL.add(30);
	aL.add(40);
	aL.add(50);
	aL.add(60);
	System.out.println("Set doesnt follow indexing,Dublicate not allowed,single num allowed"+aL);
	//Collection following sorting(aL);
	System.out.println("Sorting not allowed in set");
	Iterator i1=aL.iterator();
	System.out.println("Fordward Iteration using iterator");
	while(i1.hasNext())
	{
	
	System.out.println(i1.next());
}
	System.out.println("Iteration not possible using listIterator");


}}
