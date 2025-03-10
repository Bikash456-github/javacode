package Assignment_java;
    public class nested{
    public static void main(String[] args) {
	
	char gender1='M';
	int age   =  '7';
	if (gender1=='M')
	{
		if(age<=10)
		{
			System.out.println("ticket for adult"); 
		}
			else 
				if((age<10 && age<60))
			{	
				System.out.println("get single ticket");
			}
				else if ((age>12  &&  age<60))
			{
				System.out.println("buy half sr citizens");
			
			}
				else if((age>60)&&(age<50))
				{		
          System.out.println("free for adult");
				}
			}
	
	else if (age>60)
	{
	System.out.println("half ticket");{
	}}}}

	

	

