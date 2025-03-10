package learning;
abstract class one
{
	abstract void login_logic();
}


public class Concrete_class  extends one {
	void login_logic() {
		System.out.println("logic of login is here");	
	}
	public static void main(String[] args) {
	

	}
}
