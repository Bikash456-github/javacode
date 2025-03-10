package collections_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_List_interface_Cursor_Function8 {

	public static void main(String[] args) {
		List s1=new ArrayList();//accept dublicate
s1.add(20);
s1.add(30);
s1.add(30);
s1.add(40);
s1.add(40);
s1.add(null);
s1.add(null);
System.out.println(s1);
s1.addAll(s1)	;	


	}

}
