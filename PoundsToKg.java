import java.util.Scanner;

class PoundsToKg{
public static void main(String []args){

final float pound= 0.454f;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number in pounds: ");
float p = sc.nextFloat();

float value = pound *p;

System.out.println(p+ "  pounds is " + value+ " kg");

}
}