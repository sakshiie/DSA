class CalculateTips{
public static void main(String []args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter subtotal: ");
float subtotal=sc.nextInt();

System.out.println("Enter gratuity :");
float gratuity = sc.nextInt();

float f=subtotal*5%;
System.out.println(f);




}
}