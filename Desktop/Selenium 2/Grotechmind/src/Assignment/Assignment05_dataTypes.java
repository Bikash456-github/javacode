package Assignment;

public class Assignment05_dataTypes {
public static void main(String[] args) {
	
	//Declaration and initilaziation by method1
	numbericDataType();
	decimalDataType();
	charStringDataType();
	booLeanDataType();
	//declaration and initilization by method2
	decUnitMethod2();
	
}
static void numbericDataType() {

	byte s=123;
	short t=4758;
	int d=483447393;
	long p=4637383;
	System.out.println("byte  " +s);
	System.out.println("short "+t);
	System.out.println("int    "+d);
	System.out.println("long  "+p);
	
}


static void decimalDataType() {

	float m=343254.3343f;
	double w=384957.3738;
	System.out.println("float    "+m);
	System.out.println("double "+w);
	
	
	
	
	
}
static  void charStringDataType()
{
	char h='p';
	String m2="Bikash";
	System.out.println("char"+h);
	System.out.println("String  "+m2);
	
	
	
	
}
static void  booLeanDataType()
{
boolean b=true;
boolean b2=false;
System.out.println("boolean "+b);
System.out.println("boolean "+b2);
	
}
static  void decUnitMethod2()

{
byte b;
short s;
int i;
long l;
float f;
double d;
String s1;
boolean b1;
b=127;
s=124;
i=1234567;
l=637363736;
f=748474.74847f;
d=46484.784847;
s1="this is string";
b1=true;
System.out.println(b);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(s1);
System.out.println(b1);
}
}