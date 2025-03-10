package Assignment;

public class Assignment24_ArrayCreation {
static void Array_boolean()
{
//boolean data type array
	boolean Array_boolean[]=new boolean[2];
	Array_boolean[0]=false;
	Array_boolean[1]=true;
	
	for(int i=0;i<2;i++)
	{
		System.out.println(Array_boolean[i]);
	}	
		
}
static void Array_double()
{
	// double data type array
	double bikash[]=new double [3];
	bikash[0]=32.3;
	bikash[1]=0.8793;
	bikash[2]=32.3989;
	for (int i=0;i<3;i++)
	{
		
		System.out.println(bikash[i]);
	}
}
static void Array_char()

{
//char data type array
	char charray[]=new char[4];
	charray[0]='a';
	charray[1]='b';
	charray[2]='c';
	charray[3]='d';
	//chararray[4]='e';-----Array index outof bound
	for (int i=0;i<4;i++)
	{
		
		System.out.println(charray[i]);
	}
}
public static void main(String[] args) {
	Array_boolean();
	Array_double();
	Array_char();
	
	
	
}
}
