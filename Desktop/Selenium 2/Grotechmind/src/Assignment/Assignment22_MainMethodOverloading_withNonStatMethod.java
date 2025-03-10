package Assignment;

public class Assignment22_MainMethodOverloading_withNonStatMethod {
void main()
{
System.out.println("main without para");	
}
void main(char a)
{
	System.out.println("main with char "+a);		
}
void main( String b)
{
	System.out.println("main with string "+b);		
}	
void main(double d)
{
	System.out.println("main with double"+d);		
}	

public static void main(String[] args) {
	Assignment22_MainMethodOverloading_withNonStatMethod m2=new Assignment22_MainMethodOverloading_withNonStatMethod();
	m2.main('b');
	m2.main("Bikash");
	m2.main(123432.34);
	System.out.println("printing main method");
	
}
}