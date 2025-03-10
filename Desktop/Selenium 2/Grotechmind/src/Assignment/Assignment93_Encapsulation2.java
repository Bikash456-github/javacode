package Assignment;
class Amazon_login{
	
	private String un="bikash@gmail.com";
	private String psw ="bikash@";
	
	public String getun()//gettermethod
	{
		return un;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public void setUn(String un)//settermethod
	{
	this.un=un;	
	}	
}
public class Assignment93_Encapsulation2
{
public static void main(String[] args) {
	Amazon_login a1=new Amazon_login();	
	a1.setUn("Bikashdhungana@gmail.com");
	a1.setPsw("Bikashdhungana@gmail.com");
	System.out.println(a1.getun());
	System.out.println(a1.getPsw());
	
	
	
	
	
}
}
