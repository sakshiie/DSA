class LargestElement 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5};

		int max=arr[0];
		int min=arr[0];

		for(int num:arr){
			if(num>max) max=num;
			if(num<min) min=num;

		}
		System.out.println(min);
		System.out.println(max);
	}
}

