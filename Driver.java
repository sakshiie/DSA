import java.util.*;

class University
{
	private String name;
	private int code;
	private int noCollege;

	public University(){
	super();
	}

	public University(String name, int code, int noCollege)
	{
		this.name=name;
		this.code=code;
		this.noCollege=noCollege;
	}
	public void displayUniversity(){
		System.out.println("Name: "+name);
		System.out.println("Code: "+code);
		System.out.println("noCollege: "+noCollege);
	}
}


class Driver 
	{
	public static void main(String []args){
		University u=new University("SPPU",4110,16);
		u.displayUniversity();
}
}
