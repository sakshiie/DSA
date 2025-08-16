class Car 
{
	double price;
	String model;
	String color;
	
	Engine e=new Engine(12,44,23);
	Car(){}
	 
	Car(double price, String model, String color){
		this.price=price;
		this.model=model;
		this.color=color;
		
	}

   public void displayCar(){
	   System.out.println(price);
	   System.out.println(color);
	   System.out.println(model);
}
}
	