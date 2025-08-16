class Student 
{
	String name;
	int rollno;
	int marks;
	String grade;
	String email;
 
	 Student(String name, int rollno, int marks, String grade,String email){
        this.name=name;
		this.rollno=rollno;
		this.marks=marks;
		this.grade=grade;
		this.email=email;
	 }

      public void displayStudent(){
		      System.out.println("Name of the student "+name);
		      System.out.println("Roll no of student "+rollno);
			  System.out.println("Marks "+marks);  
			  System.out.println("Grade "+grade);  
			  System.out.println("Email "+email);
}
}
