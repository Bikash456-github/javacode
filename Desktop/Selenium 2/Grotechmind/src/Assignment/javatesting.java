package Assignment;

class Bird  {
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
	
}
class pelican extends Bird{
	public void sing() {
		System.out.println("KWAAH KWAHAH KWAHA");
		System.out.println("tweet tweet tweet");
	}
	
}
public class javatesting {

	public static void main(String[] args) {
	pelican b = new pelican();
		b.sing();
	}
}






	
