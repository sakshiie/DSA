import java.util.Scanner;

class NumOfYears{
public static void main(String []args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter Minutes: ");

int minutes=sc.nextInt();


int hours = minutes/60;
int days = hours/24; 
int years = days/365;

System.out.println(minutes+ " minutes is approximately "+ years +" years and " + days + " days");
}
}