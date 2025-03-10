package collections_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Functions5 {
public static void main(String[] args) {
	List li=new ArrayList();
	li.add(543);//3
	li.add(200);//0
	li.add(300);//1   -------
	li.add(400); //2 //remove
	
	List li2=new ArrayList();
	
	li2.add("bikash");
	li2.add("sarmila");
	li2.add("radhika");
	li2.removeAll(li);
	System.out.println(li2);
	Collections.sort(li2);
    System.out.println(li2);
}
}
