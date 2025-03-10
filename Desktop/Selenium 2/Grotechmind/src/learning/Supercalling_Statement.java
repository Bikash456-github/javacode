package learning;
class grandmother
{
	grandmother(int a,int b)
	{
		super();
		System.out.println("Constructor with char");	
	}
}
class grandparent extends grandmother
{
	grandparent(float a,float b)
	{
		super(10,20);
		System.out.println("Constructor with name");}}
class parent_class extends grandparent
{
parent_class(String name)
{
	super(30,40);
	System.out.println("Constructor with para");}}	
public class Supercalling_Statement extends parent_class
{
	Supercalling_Statement  ()
	{
		super("bikash");
		System.out.println("Constructor with non para");	
	}	
public static void main(String[] args) {
	new Supercalling_Statement  ();}}
