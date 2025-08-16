
import java.util.Scanner;
class Conditional{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter char");
char ch =sc.next().charAt(0);

 String ans =(ch>='A'&&ch<='Z')?(ch+"Uppercase"):(ch+"lowercase");
System.out.println(ans);


}
}