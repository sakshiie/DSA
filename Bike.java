class Bike 
{
	String brand;
	String model;
	String color;
	double price;
    Helmet helmet;
	Bike(String brand, String model, String color, double price){

		this.brand=brand;
		this.helmet=new Helmet(975,"blue");
		this.model=model;
		this.color=color;
		this.price=price;
	}
	public void displayBike(){

		System.out.println(brand);
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
		System.out.println("-----------------");
	}
}
