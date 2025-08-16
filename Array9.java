class Array9 
{
	//sum of even and odd
	public static void main(String[] args) 
	{
		int arr[]={2,3,4,6};
		int sum=0;
		int sum1=0;

		for(int ele:arr){
			if(ele%2==0){
				sum+=ele;
			}			
	}
	System.out.println("sum of even: "+sum);

           for(int ele:arr){
			   
			if(ele%2!=0){
				sum1+=ele;
			}			
	}
	System.out.println("sum of odd: "+sum1);	
}
}
