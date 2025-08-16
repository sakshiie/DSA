class Refill 
{
	String color;
	double size;
	String refillType;
	 Refill ref;

	Refill(String color, double size, String refillType){
	this.color=color;
	this.size=size;
	this.refillType=refillType;
	System.out.println("Refill created");

	
	}
	public void displayRefill(){
		System.out.println(color+" " +size+ " "+ refillType);
}
}
