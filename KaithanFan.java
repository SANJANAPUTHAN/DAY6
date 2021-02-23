package day6_Exercises;

import java.util.Scanner;

public class KaithanFan {
public static void main(String[] args) throws Exception {	
	FanString string=new FanString();
	while(true)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		sc.next();
		string.setFanState();
	}
}
}

abstract class FanMode
{
	FanMode state;
	public abstract void changeMode(FanString string);
}
class Mode0 extends FanMode
{

	@Override
	public void changeMode(FanString string) {
		// TODO Auto-generated method stub
		System.out.println("Fan mode 0");
		string.state=new Mode1();
	}
	
}
class Mode1 extends FanMode
{

	@Override
	public void changeMode(FanString string) {
		// TODO Auto-generated method stub
		System.out.println("Fan Mode 1");
		string.state=new Mode2();
	}
	
}
class Mode2 extends FanMode
{

	@Override
	public void changeMode(FanString string) {
		// TODO Auto-generated method stub
		System.out.println("Fan Mode 2");
		string.state=new Mode3();
	}
	
}
class Mode3 extends FanMode
{

	@Override
	public void changeMode(FanString string) {
		// TODO Auto-generated method stub
		System.out.println("Fan Mode 3");
		string.state=new Mode0();
	}
}
class FanString
{
	FanMode state=new Mode0();
	public void setFanState()
	{
		state.changeMode(this);
	}
}