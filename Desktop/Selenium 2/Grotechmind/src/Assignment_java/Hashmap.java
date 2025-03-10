package Assignment_java;
import java.util.HashMap;
import java.util.Map;
public class Hashmap {
public static void main(String[] args) {
	
	Map<String,Integer>l1=new HashMap<String,Integer>();
	l1.put("bikash", 96);
	l1.put("Dhungana", 23);
	l1.put("sarmila", 64);
	System.out.println(l1);
	
	Map<String,Integer>l2=new HashMap<String,Integer>();
	l2.put("rakesh", 86);
	l2.put("sammer", 40);
	l2.put("ramen", 43);
	l2.put("dhungana2", 78);
	System.out.println(l2);
	
}
}
