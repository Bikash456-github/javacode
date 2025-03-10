package Assignment_java;

class Fifth {
	
	Fifth(int a){
		System.out.println("My First constructor");}

Fifth(double b,int a)
{
	System.out.println("My Second constructor");
}
Fifth(char c,double b,int a){
	System.out.println("My Third constructor");
}

Fifth(char c,double b)
{
	System.out.println("My Forth constrocter");
}
Fifth(double b)
{
	System.out.println("My Fifth constrocter");
} 
  public static void main(String[] args) {
	System.out.println("we love software testing");
	  new Fifth(1);
	  new Fifth(0.1,1);
	  new Fifth('M',12.98,1);
	  new Fifth('c',92.1);
      new Fifth(0.01);
  }	
}

    

