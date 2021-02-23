package day6_Exercises;

public class ConstructorOverridingDemo {
public static void main(String[] args) {
	ParentClass parent=new ChildClass();
}
}
abstract class ParentClass
{
//	ParentClass()
//	{
//		System.out.println("Constructor from Parentclass...");
//	}
	ParentClass(int i)
	{
		System.out.println("Parent class with parameters...");
	}
}
class ChildClass extends ParentClass
{
	ChildClass()
	{
		super(21);
		System.out.println("Constructor from childClass...");
	}
}