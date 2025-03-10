package collections_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Functions3 {

	public static void main(String[] args) {
    //return type of has next =boolean 
    //return type of next=object 
	//iterator is applicable for entire collections list iterator follow only list 	
	//write this 1 st them import as it is object class
	//parameter of add all is collections
	//only add will follow  single object 
		List li=new ArrayList();
		li.add(456);
		li.add(745);
		li.add(15);
		li.add(90);
		System.out.println("before sort-> "+li);
		Collections.sort(li);
		System.out.println("after sort-> "+li);
		
		List l2=new ArrayList();
		l2.add("man");
		l2.add("women");
		l2.addAll(li);
		System.out.println("my l2 is ->"+l2);
		
		System.out.println(l2.get(3));
		boolean b1=li.equals(l2);
		System.out.println(b1);
		
		
	}

}
