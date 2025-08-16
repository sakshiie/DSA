
import java.util.Scanner;
class BMI{
public static void main(String []args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter weight in pounds: ");

float weight=sc.nextFloat();
System.out.println("Enter height in inches : ");
float height=sc.nextFloat();

double pound = 0.45359237;
double inch = 0.0254;

double kg= pound*weight;
double d=inch*height;

double BMI=kg /(d*d);
System.out.println(BMI);

}
}