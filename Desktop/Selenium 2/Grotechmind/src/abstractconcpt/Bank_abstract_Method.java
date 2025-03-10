package abstractconcpt;

public abstract class Bank_abstract_Method {
	
	int amt=100;
	final int rate =10;
	static int loanrate=5;
	//partial abstraction
	//hiding the implement is called abstraction to achive 100%
	//cannot create the object of interface 

	public abstract void loan();//abstract method which does not have implementation or method body
	//non abstract method
	public  void credit()//non abstract method 
	{
		System.out.println("Bank--credit");
		
	}
	public  void debit() // non abstract method which have method body
	{
		System.out.println("Bank--debit");
			
		
	}
	
	
}
//this abstract method can call abstract class