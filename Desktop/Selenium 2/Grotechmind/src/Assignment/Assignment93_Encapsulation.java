package Assignment;

public class Assignment93_Encapsulation
{
	private int OPT=3242;
	private String name ="Dhungana";
	
	public int getOTP()
	
	{
		return  getOTP();
	}
	
	public void setOTP(int OTP)
	{
		this.OPT = OTP;
	
	}
	
	public String getName()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name =name;
	}
	public static void main(String[] args)
	{
		Assignment93_Encapsulation obj=new Assignment93_Encapsulation();
		
		obj.setOTP(4532);
		obj.setname("bikash");
		System.out.println(obj.getOTP());
		System.out.println(obj.getName());
		
	}
}
