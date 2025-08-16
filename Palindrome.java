class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=1234;
		int rev=0;

		int i=num;
		while(i!=0){
			int rem=i%10;
			rev=rev*10+rem;
			i/=10;

		}
		System.out.println(num==rev?"num is palindrome" : "num is not palindrome");

		
	}
}
