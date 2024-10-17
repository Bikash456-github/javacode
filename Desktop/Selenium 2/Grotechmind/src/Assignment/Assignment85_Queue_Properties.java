package Assignment;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Assignment85_Queue_Properties {
	
public static void main(String[] args) 
{
	Queue q1=new LinkedList();
	q1.add(123);
	q1.add(124);
	q1.add(123);
	q1.add(12);
	q1.add(200);
	q1.add(10);
	q1.add(123);
	System.out.println(q1);
	//Collections.sort(q1);//sort is not applicable for queue
		Iterator qI=q1.iterator();
		while(qI.hasNext())	
		{
			System.out.println(qI.next());
//ListIterator qIL =q1.listIterator();List iterator is not applicable
}
}}
