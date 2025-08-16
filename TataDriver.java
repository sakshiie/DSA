class Tata 
{
	
	private String groupName;
	private String chairman;
    private String founder;
    private String headquaters;
	
	public Tata(){
		super();
	}

	public Tata(String groupName, String chairman,String founder,String headquaters){
		this.groupName=groupName;
		this.chairman=chairman;
		this.founder=founder;
		this.headquaters=headquaters;
		}

		public void displayTata(){
			System.out.println("Tata details ");
			System.out.println(groupName);
			System.out.println(chairman);
			System.out.println(founder);
			System.out.println(headquaters);
			
		}

}		
	
	
	class AutoMobile extends Tata
		{
    private String divisionName;
	private String parentCompany;
    private String ceo;
    private int noOfBrands;
	
	public AutoMobile(){
		super();
	}

	public AutoMobile(String groupName, String chairman,String founder,String headquaters,String divisionName, String parentCompany,String ceo,int noOfBrands){
		super( groupName,  chairman, founder, headquaters);
		this.divisionName=divisionName;
		this.parentCompany=parentCompany;
		this.ceo=ceo;
		this.noOfBrands=noOfBrands;
		}

		public void displayAutoMobile(){
			System.out.println("AutoMobile details ");
			System.out.println(divisionName);
			System.out.println(parentCompany);
			System.out.println(ceo);
			System.out.println(noOfBrands);
			
		}
		}

		class TataDriver
		{
			public static void main(String []args){
				AutoMobile t=new AutoMobile("Tata", "N.chandrashekhar","1886","india","Mumbai", "Tata", "Shailesh",2);
				
				t.displayTata();
				t.displayAutoMobile();
     
	               
		}

}
