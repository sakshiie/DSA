class  Employee
{
	private String name;
	private int  ID;
	 private double salary;
	private String dept;

	Employee(String name,int ID,double salary,String dept){
		this.name=name;
		this.ID=ID;
		this.salary=salary;
		this.dept=dept;
	}

	public String getName(){
		return name;
	}
	public int getId(){
		return ID;
	}
	public double getSalary(){
		return salary;
	}
    public void setSalary(int amount){
		if(salary>10000){
          salary+=amount;
		  System.out.println("salary increased by : "+amount);
		  }
		  else{
			  System.out.println("salary is too low ");
	}
	}
	public String getDept(){
		return dept;
	}
	public void setDept(String dept){
		this.dept=dept;
	}
	void displayDetails(){
	System.out.println(name);
	System.out.println(ID);
	System.out.println(salary);
	System.out.println(dept);

	
	}
}
