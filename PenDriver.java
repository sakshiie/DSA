public class PenDriver 
{
	public static void main(String[] args) 
	{

		Pen p1=new Pen("Cello", 5, "ball" );
		System.out.println("start");
		p1.ref.displayRefill();
		p1.displayPen();
		System.out.print("End");
	}
}												
