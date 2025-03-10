package learning;

public class Methodoverloding3 {

	void login (String emailid)
	{
	System.out.println("Bikash@gmail.com");	
	}

void login (long mobile)
{	
	
	System.out.println("apple56473");
}
public static void main(String[] args) {
	 Methodoverloding3 m2=new  Methodoverloding3();
	 m2.login(null);
	 m2.login(0);
	
}
}