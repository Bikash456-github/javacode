package Assignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Assignment79_80_ArrayList_Iteration {
static void Assignment79()
{
	ArrayList al=new ArrayList();
	al.add("Bikash");
	al.add('b');
	al.add(234);
	al.add(null);
	Iterator al_I=al.iterator();
	while(al_I.hasNext())
	{
		System.out.println(al_I.next());
	}
}
	static void Assignment80()
	{
	ArrayList aL=new ArrayList();
	aL.add("Dhungana");
	aL.add('b');
	aL.add(234);
	aL.add(null);
	Iterator aL_I= aL.iterator();
	
	while(aL_I.hasNext())
	{
	System.out.println(aL_I.next());
	
}
	ListIterator aL_li=aL.listIterator();
	while(aL_li.hasNext())
	{
		System.out.println(aL_li.next());
	}
	while(aL_li.hasPrevious())
	{
		System.out.println(aL_li.previous());
}
	}
	public static void main(String[] args) {
		Assignment79();
		Assignment80();
			
	}
	}

