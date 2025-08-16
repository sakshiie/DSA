
 class Mobile {
    String brand;
    String model;
    double price;
    String color;
    double camera;
    Battery battery;
    Processor p = new Processor("linux",33,11,32);

    Mobile(String brand, String model, double price, String color, double camera){
        super(); // optional here
     
        this.battery = new Battery(10,"vivo","pro max","10/2/10","3 years",11);
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.camera = camera;
    }

	public void displayMobile(){
        System.out.println("-----------------------------------");		
        System.out.println("brand"+brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println(color);
		System.out.println(camera);
}
 }
