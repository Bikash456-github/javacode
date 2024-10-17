package Main;

public class Main {
	String name;
	int age;
	//constructor
	public Main(String name,int age) {
		this.name=name;
		this.age=age;
		}
	
//non static method
public void displayInfo() {
	System.out.println("Name" +name);
	System.out.println("Age"+age);}
	
	public static void main(String[] args) {
	//creating an instance of constructor using constructor
		
		Main M2 = new Main("pokhara",30);
		//calling the non static method by using object
		M2.displayInfo();

	}}

	
