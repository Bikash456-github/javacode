package collections_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Functions4 {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("bikash");//3
		li.add(200);//0
		li.add(300);//1   -------
		li.add(400); //2 //remove
		//System.out.println("before sort-> "+li);
		//Collections.sort(li);
		//System.out.println("after sort-> "+li);	

		li.remove(0);
		System.out.println("after remove->"+li);
		
		li.remove("BIKASH");
		System.out.println("after object remove " + li);
	}

}
