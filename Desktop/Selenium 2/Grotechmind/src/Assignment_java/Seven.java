package Assignment_java;//learning about this statement 
public class Seven 
{
      Seven(){
    	  System.out.println("my zero constructor");
      }
Seven(int a)
{
	this();
	System.out.println("my first constructor");
}
Seven(double b,int a)
{
this(1);
System.out.println("my second constructor");
}
Seven(char c,double b ,int a)
{
	this (21.11,11);
	System.out.println("my thirst constructor");
}
Seven(char c,double b)
{
	this('Q',43.54,11);
	System.out.println("my forth constructor");
}
Seven(double b)
{
	this('A',98.65);
}
public static void main(String[] args) {
	System.out.println("we love software testing");
	new Seven(0.98);
	
}
}
