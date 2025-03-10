package Assignment;

public class Account {
	
	/*Write a Java program to create a class called Account with instance variables 
	 * accountNumber and balance.
	 *  Implement a parameterized constructor that initializes these variables with validation:
	 

	accountNumber should be non-null and non-empty.
	balance should be non-negative.
	Print an error message if the validation fails.

	*/

	
	private String acc_num;
	private float bal;
	Account(String acc_num,float bal)
	{
		if((acc_num!=null) && (bal>=0))
		{
			System.out.println("customer account  number is"+acc_num);
			System.out.println("customer account balance is"+bal);
		}
		else if(bal<0)
		{
			System.out.println("*****Error  customer account have insufficient funds***");
		}
		this.acc_num=acc_num;
		this.bal=bal;
	}
	public static void main(String[] args)
		{
		Account a1=new Account("CYSE12345",-123.3f);
		@SuppressWarnings("unused")
		Account a2=new Account("CYSE12345",1231234.23f);
		System.out.println(" account number is"+a1.acc_num);
		System.out.println("balance is "+a1.bal);
		
		
		}
	}

