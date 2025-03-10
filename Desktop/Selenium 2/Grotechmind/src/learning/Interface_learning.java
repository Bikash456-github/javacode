package learning;
interface Google1
{
	void login_auth_google();
	void logout_auth_google();
}
interface Amazon1 extends Google1
{
	void login_auth_amzn();
	void logout_auth_amzn();
}
public class Interface_learning  implements Amazon1{
public static void main(String[] args) {
	
}
	
	public void login_auth_google() {
	
	
	}
	
	public void logout_auth_google(){	
	}

	
	public void login_auth_amzn() {
	
		
	}
	
	public void logout_auth_amzn() {
		
		
	}

}
