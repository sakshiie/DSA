class College 
{
	String name;
	String dept;
	int staff;
	double fees;
    Student s=new Student("sakshi",101,200,"A+","sakshi@gmail.com");
	College(String name, String dept, int staff, double fees){
		this.name=name;
		this.dept=dept;
		this.staff=staff;
		this.fees=fees;

	}

	public void displayCollege(){
		System.out.println("Name of the College "+name);
		System.out.println("Department"+dept);
		System.out.println("No of Staff  ");
		System.out.println("Fees ");
}
}
