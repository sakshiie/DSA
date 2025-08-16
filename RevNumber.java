class RevNumber 
{
	public static void main(String[] args) 
	{
		int num=29;

		if(num<=1){

		 System.out.println("Number is not prime");
	}
	for(int i=2; i<=num/2; i++){
		if(num%i==0){
         System.out.println("Number is not prime");
		 return;
		}
       

	} System.out.println("Number is prime");

	}
}

