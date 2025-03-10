package collections_interface;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Collection_Set_interface_Cursor_Function10 {

	public static void main(String[] args) {
		Set s1=new HashSet(); //does not accept dublicate
		
s1.add(20);
s1.add(30);
s1.add(30);
s1.add(40);
s1.add(null);//add return type is only object
s1.add(null);
System.out.println(s1);
boolean m1=s1.addAll(s1)	;	//addall return type is entire collection
		System.out.println(m1);
		
		
		



		
	}

}
