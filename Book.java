class Book 
{
	String brand;
	String type;
	String color;
	double price;
	
   Book(String brand,String type,String color,double price){
     super();
	 this.brand=brand;
	 this.type=type;
	 this.price=price;
	 this.color=color;

	}
	public void displayBook(){
          System.out.println(brand);
	      System.out.println(type);
	      System.out.println(price);
		  System.out.println(color);
		  System.out.println("------------------------");

	}
}
