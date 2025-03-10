package Assignment_java;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
public class Stackassignment{
public static void main(String[] args) {
	

Stack<Integer> b1=new Stack<Integer>();
b1.add(20);
b1.add(43);
b1.add(50);
b1.add(70);

System.out.println(b1);
Enumeration<Integer> e1=b1.elements();
while(e1.hasMoreElements()) {
System.out.println(e1.nextElement());

Iterator<Integer>it=b1.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
/*
for(Integer element:b1) {
System.out.println(element);
*/

}}}}	
	

