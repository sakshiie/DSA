import java.util.Arrays;
class clockwise
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7};

		for (int i=0; i<=arr.length ;i++ )
		{
			for(int j=arr.length-2; j>=0; j--){
				int temp=arr.length-1;
                arr[j+1]=arr[j];
				arr[0]=temp;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
