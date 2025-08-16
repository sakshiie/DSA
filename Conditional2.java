import java.util.Scanner;
class Conditional2{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
char ch =sc.next().charAt(0);

String op= ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>='a'&&ch<='z'))?(ch+" is lowercase"):(ch+" is uppercase"):((ch>='0' && ch<='9')?(ch+" is a digit"): (ch+"is a special character"));
System.out.println(op);

}
}
