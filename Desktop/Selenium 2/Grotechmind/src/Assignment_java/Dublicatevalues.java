package Assignment_java;
import java.util.ArrayList;
import java.util.List;
public class Dublicatevalues {
	public static void main(String[] args) {
	//create a list with dublicate values
		List<Integer>myList=new ArrayList<>();
		//Add elements to the list ,including dublicates
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(2);//dublicate
		myList.add(3);//dublicate
		myList.add(6);
		myList.add(2);//dublicate
		
		//print the list
		System.out.println("List with dublicates"+myList);
		
		

	}

}
