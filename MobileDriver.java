class MobileDriver 
{
	public static void main(String[] args) 
	{
     Mobile obj=new Mobile("iphone","16pro", 10000.0,"black",12.3);

	 obj.battery.displayBattery();
	 obj.p.displayProcessor();
	 System.out.println("Mobile starts");
	 obj.displayMobile();
	 
	}
}
