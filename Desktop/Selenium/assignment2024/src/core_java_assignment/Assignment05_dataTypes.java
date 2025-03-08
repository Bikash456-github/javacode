package core_java_assignment;

public class Assignment05_dataTypes {
	
static void numericdatatype()
{
byte s=12;
short t=4553;
int i=342564;
long l=786499847;
System.out.println("Byte"+s);
System.out.println("short"+t);
System.out.println("int"+i);
System.out.println("long"+l);
}
static void decimaldatatype()
{
float m=4758.57484f;
     //float can store decimal points up to 3 deigits
	//we have to write fin from of float value always 
double w=84993.8393;	
//double can store decimal points up to 17 digits
System.out.println("float"+m);
System.out.println("double"+w);


}
static void charstringdatatype()
{
char h='f'	;
String string2="Bikash Dhungana";
System.out.println("char"+h);
System.out.println("string2"+string2);
}
static void booleandatatype()
{
boolean b=true;
boolean b4=false;
System.out.println("boolean"+b);
System.out.println("boolean"+b4);


}
static void decinitmethod()
{
	byte b;
	short s;
	int i;
	long l;
	double d;
	float f;
	char c;
	String s1;
	boolean b1;
	b=127;
	s=3466;
	i=786543;
	f=8764.7648f;
	d=4637.5674;
	c='C';
	s1="This is String";
	b1=true;
	
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(f);
	System.out.println(d);
	System.out.println(c);
	System.out.println(s1);
	System.out.println(b1);

}
public static void main(String[] args) {
	//	Declaration and initilazation by method 1
	numericdatatype();
	decimaldatatype();
	charstringdatatype();
	booleandatatype();
	//decelaration and initialazation by method 2
	decinitmethod();
}

}
