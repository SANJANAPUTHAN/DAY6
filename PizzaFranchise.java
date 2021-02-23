package day6_Exercises;

public class PizzaFranchise {
public static void main(String[] args) {
	Coimbatore cbe=new Coimbatore();
	cbe.makePizza();
	cbe.sendDelivery();
}
}
abstract class Domino
{
	public final void chooseFlour()
	{
		System.out.println("Flour selected...");
	}
	public final void chooseIngredients()
	{
		System.out.println("Ingredients selected...");
	}
	public final void packingBox()
	{
		System.out.println("Packing BOx selected...");
	}
	public abstract void makePizza();
	public abstract void sendDelivery();
	
}
class Coimbatore extends Domino
{

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		chooseFlour();
		chooseIngredients();
		packingBox();
		System.out.println("pizza cooked...");
	}

	@Override
	public void sendDelivery() {
		// TODO Auto-generated method stub
		System.out.println("pizza delivered...");
		
	}
	
}