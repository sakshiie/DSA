import java.util.Scanner;

class Vowel{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character :");
char ch =sc.next().charAt(0);
  
String ans= (ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')?(ch+"vowel"):(ch+"consonent");
System.out.println(ans);
}
}
