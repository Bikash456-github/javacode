package learning;

public class nonstatic2method 
{
void add(int a,int b)
{
	int sum=a+b;
	System.out.println(sum);
	
	}

void sub(int a,double b)
{
	double result =a-b;
	System.out.println(result);
}
static void sub2(int b,int c)
{
	double result =b-c;
	System.out.println(result);
}
public static void main(String[] args) {
	nonstatic2method  m1=new nonstatic2method ();
	m1.add(10, 20);
	new nonstatic2method ();
	m1.sub(50, 10);
	nonstatic2method .sub2(40, 30);
}
}
