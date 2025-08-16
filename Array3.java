import java.util.Arrays;
class Array3 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		for(int ele:arr){
			System.out.println((isEvenOdd(ele)? "even":"odd"));
	}
	}

	public static boolean isEvenOdd(int ele){
		return ele%2==0;
}
}
