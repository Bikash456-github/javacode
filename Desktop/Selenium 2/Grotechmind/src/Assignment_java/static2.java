package Assignment_java;

public class static2 {
	//You can write
	void Add(int a,int b)//non static para method 
	{  a=10;//initialise 
	b=20;//initialise 
	System.out.println(a+b);
	}
	
	
	public static void main(String [] args){
	//create object of class .suppose class name nineth2 then
	nineth2 abc=new nineth2();
	abc.Add();
	}
}
