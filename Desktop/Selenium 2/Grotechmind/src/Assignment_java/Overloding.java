package Assignment_java;

public class Overloding {
	String name;
	int age;
	//constructor with no argument 
	public Overloding() {
		this.name="unknown";
		this.age=0;}
		//constructor with one argument
		public Overloding(String name) {
			this.name=name;
			this.age=20;
		}// default age}
			//constructor with two arguments
			public Overloding(String name,int age) {
				this.name=name;
				this.age=23;}
			//non static method to display
		public void displayInfor() {
			System.out.println("name:"+name);
			System.out.println("Age:"+age);}
		public static void main(String[] args){ {
				//using the no argument constructor
				Overloding Overloding1=new Overloding();
				Overloding1.displayInfor();
				//using the constructor with one argument
				Overloding Overloding2=new Overloding("BIKASH");
				Overloding2.displayInfor();}
				//using the constructor with two arguments
				Overloding Overloding3=new Overloding("SARMILA",22);
				Overloding3.displayInfor();}}
			
		
		
		
		
		


