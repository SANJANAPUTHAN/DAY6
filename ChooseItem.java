package day6_Exercises;

public class ChooseItem {
public static void main(String[] args) throws Exception {
	Bulldog dog=NaughtyChild.ChildSelect(args[0]);
	dog.chooseItem();
}
}

abstract class ItemType
{
	public abstract void chooseType();
}
class Stick extends ItemType
{
	@Override
	public void chooseType() {
		// TODO Auto-generated method stub
		System.out.println("bite..");
	}
}
class Stone extends ItemType
{
	@Override
	public void chooseType() {
		// TODO Auto-generated method stub
		System.out.println("bark...");
		
	}
}
class Bulldog
{
	ItemType item;
	public void chooseItem()
	{
		item.chooseType();
	}
}
class NaughtyChild
{
	public static Bulldog ChildSelect(String itemname) throws Exception
	{
	Bulldog dog=new Bulldog();
	@SuppressWarnings("deprecation")
	ItemType type=(ItemType)Class.forName(itemname).newInstance();
	dog.item=type;
	return dog;
	}
	
}