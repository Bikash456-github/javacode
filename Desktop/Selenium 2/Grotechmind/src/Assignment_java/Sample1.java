package Assignment_java;

public class Sample1 {

void dumb(){//non static method
		
   System.out.println("you are dumb");

}
static void deaf() //static method
{
	System.out.println("you are deaf");
}
public static void main(String[] args) {
	{
	System.out.println("we love software testing");
	deaf();
	Sample1 m1=new Sample1();
	m1.dumb();
	//new sample().dumb();
	}
}
}
	
	
	

	
