package Assignment;

public class Assignment67_Math_Class {
public static void main(String[] args) 
{ 
	int a=20;
	int b=30;
	float c=123.5f;
	float c1=1023.5f;
	double d=100.324;
	double d1=1000.234;
	long l=12300;
	long l1=1234;
	
	
	
	
	System.out.println(Math.addExact(a,b));
	System.out.println(Math.addExact(l,l));
	System.out.println(Math.subtractExact(a,b));
	System.out.println(Math.subtractExact(l,b));
	System.out.println(Math.max(a,b));
	System.out.println(Math.max(c,c1));
	System.out.println(Math.max(d,d1));
	System.out.println(Math.max(l,l1));
	System.out.println(Math.min(a,b));
	System.out.println(Math.min(c,c1));
	System.out.println(Math.min(l,l1));
	System.out.println(Math.multiplyExact(a,b));
	System.out.println(Math.multiplyExact(l1,l));
	System.out.println(Math.multiplyExact(a,l));
	System.out.println(Math.abs(a));
	System.out.println(Math.abs(l));
	System.out.println(Math.abs(d));
	System.out.println(Math.abs(c));
	System.out.println(Math.random());
//	System.out.println(Math.divideExact(b,a));
//	System.out.println(Math.divideExact(l1,l));
	
	
	
	
	
}
}
