class Pen 
{
	String brand;
	String type;
	String color;
	double price;
	 
	 Pen(String brand, String type, String color, double price){
		 this.brand=brand;
		 this.type=type;
		 this.color=color;
		 this.price=price;
	 }
	 public void displayPen(){
		 System.out.println(brand);
	 System.out.println(type);
	  System.out.println(price);
	   System.out.println(color);
	   System.out.println("---------------------");
}
}