class Bag 
{
	private String brand;
	private String type;
	private String color;
	private double price;
	private int comp;
	private String material;

    Laptop laptop=new Laptop("Lenovo", "i3 ", "victus", 10000.0);
    Pen pen=new Pen("Trimax", "Gel","red ",10);
	Book book=new Book("Classmate", "A4","White", 200);

	public Bag(String brand,String type,String color,double price,int comp,String material){
     super();
	 this.brand=brand;
	 this.type=type;
	 this.price=price;
	 this.comp=comp;
	 this.material=material;
	 this.color=color;
	}

	public void displayBag(){
       System.out.println(brand);
	   System.out.println(type);
	   System.out.println(price);
	   System.out.println(comp);
	   System.out.println(material);
	   System.out.println(color);
	   System.out.println("------------------------");
	}	
}
