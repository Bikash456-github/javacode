package Assignment_java;

public class BikashPerson {


	private String name;
	@SuppressWarnings("unused")
	private int age=30;
	@SuppressWarnings("unused")
	private String address;
	//constructor
	public BikashPerson(String name,int age,String address) {
	this.name = name;
	this.age = age;
	this.address = address;
	}
	public static void main(String[] args) 
	{
		BikashPerson bikash = new BikashPerson("bikash",30,"pokhara");
		System.out.println(bikash.name);
	}
}