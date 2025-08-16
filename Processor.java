class Processor 
{
	String type;
	double clockspeed;
	int ram;
	int rom;

	Processor(String type,double clockspeed,int ram,int rom){
	this.type=type;
	this.clockspeed=clockspeed;
	this.ram=ram;
	this.rom=rom;

	}
	public void displayProcessor(){
		System.out.println("-----------------------------------");
		System.out.println(type);
		System.out.println(clockspeed);
		System.out.println(ram);
		System.out.println(rom);

	}
}
