class Human
{
	double height;
	double weight;
	String name;
	Mobile mobile;

	Human(double height, double weight, String name){
		this.weight=weight;
		this.height=height;
		this.name=name;
		this.mobile=new Mobile("vivo "," --",30000,"pink",21);
	}
	public void displayHuman(){

		System.out.println("Name: "+name);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
	}

}
