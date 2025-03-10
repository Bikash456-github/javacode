package Assignment_java;

public class Stringbuffer1 {
public static void main(String[] args) {
	
	StringBuffer s1=new StringBuffer("automation testing");
	System.out.println(s1.substring(11));
	System.out.println(s1.delete(0, 11));
	System.out.println(s1.replace(0, 10, "bikash"));
	System.out.println(s1.length());
	s1.append("Dhungana");
	System.out.println(s1);
	
}
}
