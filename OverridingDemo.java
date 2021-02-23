package day6_Exercises;

public class OverridingDemo {
public static void main(String[] args) {
	parent p=new child();
	p.method();
	p.method1();
	p.method2();
}
}
abstract class parent
{
	final public void method()
	{
		System.out.println("final keyword usage...");
	}
	public abstract void method1();
	public void method2()
	{
		System.out.println("overriding demo from parent..");
	}
}
class child extends parent
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("abstract method usage...");
	}
	public void method2()
	{
		super.method2();
		System.out.println("overriding method from child class...");
	}
	
}