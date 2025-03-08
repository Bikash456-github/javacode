package core_java_assignment;

public class Assignment08_StatAndNonStaticMethods {
void add()
{
int a=10; //secondlast
int b=20;
int c=a+b;
System.out.println(c);
}	
void sub()	//last
{
int a=100;
int b=50;
int c1=b-a;
System.out.println(c1);
}
static void div()   //fist
{
int a=20;
int b=10;
int div=a/b;
System.out.println(div);
}
static void mod()    //second
{
int a=10;
int b=5;
int mod=a%b;
System.out.println(mod);
}
public static void main(String[] args) {
	//calling static method by method name
	//calling non static method by creating an object
	//Syntax
	//classname variable=new classname();
	//variable.emthodname();
	Assignment08_StatAndNonStaticMethods bikash=new Assignment08_StatAndNonStaticMethods();
	bikash.add();
	bikash.sub();
	div();
	mod();
}
}
