package Assignment_java;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class Shorting {
	
	public static void main(String[] args) {
		List<Integer> li=new Vector<Integer>();
		li.add(50);
		li.add(40);
		li.add(30);
		li.add(20);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(45);
		
		//li.add(null);
	//li.add("bikash");
		System.out.println(li);
		
		Collections.sort(li);
		System.out.println(li);
		Iterator<Integer> il=li.iterator();
		while(il.hasNext()) {
		
		
	}
	}
}
