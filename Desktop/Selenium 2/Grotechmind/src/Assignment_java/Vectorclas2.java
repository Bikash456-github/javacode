package Assignment_java;
import java.util.List;
import java.util.Vector;
public class Vectorclas2 {
	
	public static void main(String[] args) {
		
	//create a vector
	List<String>vector=new Vector<>();
	//Add elemtnts
	vector.add("suman");
	vector.add("krishna");
	vector.add("shyam");
	//Display the vector
	System.out.println("vector:"+vector);
	//check if an elements exits
	System.out.println("Does the list contain java"+vector.contains("Vector"));

}
}