public class ShoppingCartDriver 
{
	public static void main(String[] args) 
	{

		ShoppingCart s1=new ShoppingCart("Book",200.0);
		s1.getItemName();
		s1.displayCart();
	    
		ShoppingCart s2=new ShoppingCart("Pen",20.0);
		
		s2.setItemName("Pencil");
		s2.displayCart();
	}
}
