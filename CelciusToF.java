import java.util.Scanner;

class CelciusToF{

public static void main(String []args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter a degree in celcius: ");

float celcius = sc.nextFloat();

final double Fahrenheit= ((9.0/5)*celcius+32);

System.out.println(celcius+ " Celcius is " + Fahrenheit + " Fahrenheit");

}
}