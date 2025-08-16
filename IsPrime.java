import java.util.Scanner;

class IsPrime{
public static void main (String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter a num: ");
int num=sc.nextInt();

System.out.println((num==2||num==3)?(num+" is prime"):
((num%3==0||num%2==0)?(num+" is not prime"):(num+" num is prime")));


}
}