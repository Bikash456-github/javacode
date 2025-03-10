package learning;

public class Nonstaticmethod {
	
void add() {
int a=10;
int b=20;
int sum =a+b;
System.out.println(sum);
}
void sub() {
int a=10;
int b=20;
int sub =b-a;
System.out.println(sub);
}
public static void multi() {
int a=10;
int b=20;
int mul =b*a;
System.out.println(mul);
}
public  static void divide() {
int a=20;
int b=40;
int div =b%a;
System.out.println(div);
}

public static void main(String[] args) {
	Nonstaticmethod m1=new Nonstaticmethod();
	Nonstaticmethod m2=new Nonstaticmethod();
	m1.add();
	m2.sub();
	Nonstaticmethod.multi();
	divide();
	multi();
	
}
}
//public private package procted =access specifier
