package Assignment_java;
import java.util.Scanner;
public class package_inheritance {
	static int a =2;
	static double pi=3.14;
	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		 int add=n1.nextInt();
		System.out.println("enter the radius of circle");
		long r = n1.nextLong();
		double circumferance= a*pi*r;
		System.out.println("circumferance of circle - " +circumferance);
		package_inheritance n2=new package_inheritance();
		System.out.println("rakesh,20");
		n1.notify();
		n1.close();
	}
		
	}


