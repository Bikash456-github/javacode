package Assignment;

public class Assignment23_AreaOfTenCircle_UsingMathClass {
//find out area of 10 circle where for every circle radious came from math.random 

static double pi=Math.PI;
//math.pi method comes from math class,math class comes from java.lang package
public static void main(String[] args) {
	double r=Math.random();
	for(int i=0;i<10;i++)
	{
		System.out.println("radious of circle is"+i+"->"+r);
		double circleArea=pi*r*r;
		System.out.println("Area of circle "+i+"->"+circleArea);
	}
		
}


}
