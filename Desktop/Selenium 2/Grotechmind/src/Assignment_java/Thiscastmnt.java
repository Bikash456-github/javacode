package Assignment_java;

public class Thiscastmnt {
	Thiscastmnt()
	{
	System.out.println("no parameter");
	}
	
	Thiscastmnt(int age)
	{this();
	System.out.println("this constructor prints age"+age);
	}
	Thiscastmnt(String name){
		this(20);
	System.out.println("this constructor print stringname"+name);
	}
	Thiscastmnt(double sal){
		this(500.500f);
			System.out.println("this constructor prints double salary"+sal);
	}
	Thiscastmnt(float bonus){
		this("ram");
		System.out.println("this constructor float bonus"+bonus);
	}
public static void main(String[] args) {
	@SuppressWarnings("unused")
	Thiscastmnt m1=new Thiscastmnt(1000.100);
}
}