package Assignment_java;
import java.util.Scanner;
public class Area_of_trapezium_scanner {
	static double f =  0.5;
	public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner n1=new Scanner(System.in);
			
			System.out.println("enter the length of 1st base of traapezium");
          long a=n1.nextLong();
          System.out.println("enter the length of 2nd base of trapezium");
           long b=n1.nextLong();
	
	System.out.println("enter the hight of trapezium");
long h=n1.nextLong();{
double area=f*(a+b)*h;
System.out.println("area of trapezium-"+area);
}
}
	}