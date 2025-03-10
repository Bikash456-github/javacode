package learning;

public class Globalvariable2 {
	
	String name ="bikash";//Global  variable
	static double Bikash_salary=4000.32;//global variable
	
	
public static void main(String[] args) {
Bikash_salary=5000; //global variable updated from local variable
System.out.println(Bikash_salary);
Globalvariable2 m1=new Globalvariable2();
m1.name="bikash dhungana";//gloabl variable updated from local
System.out.println(m1.name);
	
	
	
	
}
}
