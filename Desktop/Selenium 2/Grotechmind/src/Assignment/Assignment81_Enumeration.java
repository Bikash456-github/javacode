package Assignment;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;
public class Assignment81_Enumeration {

	public static void main(String[] args) {
	Stack<Comparable> s1=new Stack<Comparable>();
	s1.add("Bikash");
	s1.add('S');
	s1.add(2345);
	s1.add(null);
	
	Enumeration<Comparable> e1=s1.elements();
	while(e1.hasMoreElements())
	{
System.out.println(e1.nextElement());
	}
Vector<Comparable> s2 =new Vector<Comparable>();
s2.add("Bikash");
s2.add('S');
s2.add(2345);
s2.add(null);
Enumeration<Comparable> e2=s2.elements();
while(e2.hasMoreElements())
{
System.out.println(e2.nextElement());
}}
}