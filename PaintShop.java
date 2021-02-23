package day6_Exercises;

public class PaintShop {
		
	
	//public static String PaintColor;
	public static void main(String[] args) throws Exception {
		PaintBrush brush=container.selectPaint(args[0]);
		System.out.println(brush.doPaint());
	}
}
class container
{
	public static PaintBrush selectPaint(String PaintColor) throws Exception
	{
	PaintBrush brush=new PaintBrush();
	@SuppressWarnings("deprecation")
	Paint paint=(Paint)Class.forName(PaintColor).newInstance();
	brush.paint=paint;
	return brush;
	}
}
abstract class Paint
{
	
}
class RedPaint extends Paint
{
	
}
class BluePaint extends Paint
{
	
}
class PaintBrush
{
	Paint paint;
	public Paint doPaint()
	{
		return paint;
	}
}