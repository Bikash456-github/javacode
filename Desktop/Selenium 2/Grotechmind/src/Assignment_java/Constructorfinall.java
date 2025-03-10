package Assignment_java;

public class Constructorfinall {

void add(int a ,int b)//non static method
{ 
	int sum =a+b;
	System.out.println("non static sum of 2 ");
	System.out.println(sum);
}
static void sub(int a,int b)//non static method
{
	int sub=a-b;
	System.out.println("non static sum of 2");
	System.out.println(sub);
}
static void add(int a,int b,int c) //non static 
{
	int t=a+b+c;
	System.out.println(t); 
}
static void mul(int a,int b)//static method
{ 
	int r=a*b;
	System.out.println("ststic method mul of 2 number is ");
	System.out.println(r);
}static void div(int c, float d)//static method
{
	float re=c*d;
	System.out.println("Static method div variable is");
	System.out.println(re);
}
Constructorfinall ( float c,int a)
{
	System.out.println(c);
}
Constructorfinall( int c ,float a)
{
		float sal=c*a;
		System.out.println(sal);
}
Constructorfinall( int a ,int b,int c)
{
	if ((a>b)&&(a>c))
System.out.println("a is big");
else if (b>c)
	System.out.println("b is big");
else 
	System.out.println("c is big");
	
}
public static void main(String[] args) 
{
	mul(6,10);
	add(12,5,25);
	sub(100,30);
	Constructorfinall cd1=new 
			Constructorfinall (12.3f,23);
Constructorfinall  cd2=new
		Constructorfinall (4323,43.5f);
Constructorfinall cd3=new 
Constructorfinall (13,14,15);
System.out.println("********* cd1");
cd1.add(12,13);
Constructorfinall.add(12,13,14);
Constructorfinall.sub(25,10);//calling non static method with 1 oject cd1
System.out.println("********* cd2");
cd2.add(17,13);
Constructorfinall.add(234,456,578);
Constructorfinall.sub(456,234);
//calling non static s2 object cd2
System.out.println("********* cd3");
cd3.add(75,125);
Constructorfinall.add(900,800,700);
Constructorfinall.sub(1000,32);
}
}


