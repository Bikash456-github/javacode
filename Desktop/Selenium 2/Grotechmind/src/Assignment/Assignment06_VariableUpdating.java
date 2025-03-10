package Assignment;

public class Assignment06_VariableUpdating {
public static void main(String[] args) 
{
	variablevalueupdate();
}
static void variablevalueupdate()	
{
	byte b;//1 digit data type
	short s;//2 digit data type
	int i;//4 digit data type
	long l;//8 digit ddata
	float f;///4 digit data type
	double d;//8 digit
	char c;//2 digit data type
	String s1;//name
	boolean b1;//true or false
	
	b=1;
	s=56;
	i=7857;
	l=87096579;
	f=66.68f;
	d=76865576;
    c='c';
	s1="this is string";
	b1=true;
	
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(c);
	System.out.println(s1);
	System.out.println(b1);
	
	//value update

	b=-1;
	s=-56;
	i=78579857;
	l=87096579;
	f=6.68f;
	d=76865.576;
    c='c';
	s1="this is updated string";
	b1=false;
	System.out.println("Afterupdated "+b);
	System.out.println("Afterupdated "+s);
	System.out.println("Afterupdated "+i);
	System.out.println("Afterupdated "+l);
	System.out.println("Afterupdated "+f);
	System.out.println("Afterupdated "+d);
	System.out.println("Afterupdated "+c);
	System.out.println("Afterupdated "+s1);
	
	
	
	
	
}



}
