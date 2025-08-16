class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int num=123;
		int sum=0;

		for(int i=num; i>0; i/=10){
			sum+=num%10;
			

	}
	System.out.println("sum :"+sum);
}
}
