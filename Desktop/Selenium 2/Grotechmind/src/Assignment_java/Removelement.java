package Assignment_java;
import java.util.LinkedList;
import java.util.List;
public class Removelement {

	public static void main(String[] args) {
		//create a linkedList
		List<String>linkedList=new LinkedList<>();
//Add elements
		linkedList.add("Bikash");
		linkedList.add("kumar");
		linkedList.add("sarmila");
		linkedList.add("subedi");
		//Display the elementList
		System.out.println("linkedList:"+linkedList);
		//remove a element by index
		linkedList.remove(1);
		System.out.println("linkedList after removal:"+linkedList);
	}

}
