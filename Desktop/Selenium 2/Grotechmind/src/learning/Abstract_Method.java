package learning;

abstract class  facebook_auth
{
	abstract void fb_login();
	abstract void fb_registeration();
}
 abstract class Google_auth extends facebook_auth
 {
	abstract void Google_login() ;
	abstract void google_registeration();	 
 }
public class Abstract_Method  extends Google_auth
{
public static void main(String[] args) {
	
}
void Google_login() {
	
	System.out.println("Bikash");
}
void google_registeration() {
	
	
}
void fb_login() {
	
	
}
void fb_registeration() {
	
	
}
}
