package Assignment;

public class Gettersettter {

	
private String un="@gmail.com"	;
private int otp=8915;

public void setotp(int otp) {
	this.otp=otp;
}
	public int getotp() {
		return otp;
	}
	
	


public String getUn(String Un) //getter method
	{
	return Un;
	}
public void settUn(String Un)//setter method
{
	this.un=un;
} 
}
/*
public class Gettersettter
{
public static void main(String[] args) 
	{
	Gettersettter a1=new Gettersettter();
	
a1.settUn("@gmail.com");
a1.setPwd("dhungana");

System.out.println(a1.getUn());
System.out.println(a1.getPwd());
}
}
*/