package Assignment;

public class Stringbuffer {
public static void main(String[] args) {
	/*
	StringBuffer c=new StringBuffer("hello");
	StringBuffer c1=new StringBuffer(" world");
	c.append(c1);
	System.out.println(c);
	*/
	
	String k="bikash";
	System.out.println("substring(int(Start index),(end index));"+
	k.substring(2,6));
    System.out.println();
	StringBuffer e=new StringBuffer(5);
	System.out.println(e.capacity());
	StringBuffer k1=e.append("Bikash");
	System.out.println(k1);
	System.out.println(k1.capacity());
	
	
	
	
}
}
