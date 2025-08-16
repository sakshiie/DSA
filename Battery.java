class Battery 
{
  int capacity;
  String brand;
  String type;
  String manufDate;
  String warranty;
  double power;

  Battery(int capacity,String brand,String type,String manufDate,String warranty,double power){
  this.capacity=capacity;
  this.brand=brand;
  this.type=type;
  this.manufDate=manufDate;
  this.warranty=warranty;
  this.power=power;
  }

  public void displayBattery(){
      System.out.println("-----------------------------------");
      System.out.println(brand);
	  System.out.println(type);
	  System.out.println(warranty);
  }
}
