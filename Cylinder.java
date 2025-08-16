import java.util.Scanner;

class Cylinder{
public static void main(String []args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius and height of a cylinder: ");

float radius= sc.nextFloat();
int height= sc.nextInt();

double area=3.14*radius*radius;
double volume=area*height;

System.out.println("The area is : "+ area);
System.out.println("The volume is: "+volume);


}
}
