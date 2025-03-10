package Assignment_java;

abstract class Facebook_auth
	{
     abstract void Fb_login();
       abstract void Fb_registration ();
	}
abstract class Google_auth extends Facebook_auth
{

	abstract void google_login();
	abstract void google_registration();
}
abstract class bikash extends  Grotechminds{

	abstract void Google_fbd();
	abstract void facbook_login();
}
abstract class sarmila extends bikash
{
	abstract void rakesh_iu();
	abstract void facbook_ww();

}

public class Grotechminds extends Google_auth
{

	public static void main(String[] args) {
		
}
	@Override
	void google_login() {
		
		
	}

	@Override
	void google_registration() {
		
		
	}

	@Override
	void Fb_login() {
			
	}

	@Override
	void Fb_registration() {
		
	}
	}
	