import java.util.Scanner;

class LoopConditional{

public static void main(String[]args){

Scanner sc =new Scanner(System.in);
System.out.println("Enter num");
int num=sc.nextInt();

String ans= ((num%2==0)&&(num%5==0))?("HiTwoHiFive"):((num%2==0)?("hitwo"):((num%5==0)?("Hifive"):("blank")));
System.out.println(ans);
}
}
