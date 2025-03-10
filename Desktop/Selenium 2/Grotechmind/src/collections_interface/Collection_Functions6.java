package collections_interface;

import java.util.ArrayList;
import java.util.List;

public class Collection_Functions6  {
public static void main(String[] args) {
	List li=new ArrayList();
	li.add(543);//3
	li.add(200);//0
	li.add(300);//1   -------
	li.add(400); //2 //rem
	System.out.println(li.size());
	
	
	System.out.println(li);
	boolean b1=li.contains(30000);
	System.out.println(b1);
	
	
	
	
}
}
