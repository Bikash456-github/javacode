package Assignment_java;
import java.util.ArrayList;
import java.util.List;
public class newnullvalue {
public static void main(String[] args) {
	//create a list that store null values
	List<String>myList=new ArrayList<>();
	//Add null values to the list
	myList.add(null);
	myList.add("hello");
	myList.add("pokhara");
	myList.add("Ram");
	myList.add(null);
	myList.add(null);
	
	//print the list 
	System.out.println("list with null values:"+ myList);

	}

}
