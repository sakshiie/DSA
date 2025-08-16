class Laptop 
{
	String brand;
	String type;
	String model;
	double price;
	 
	 Laptop(String brand, String type, String model, double price){
		 this.brand=brand;
		 this.type=type;
		 this.model=model;
		 this.price=price;
	 }
	 public void displayLaptop(){
		 System.out.println(brand);
	 System.out.println(type);
	  System.out.println(price);
	   System.out.println(model);
	   System.out.println("---------------------");
}
}
