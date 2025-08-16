import java.util.Arrays;
class Array4 
{
	public static void main(String[] args) 
	{

		int arr[]={1,2,3,4,5,6,7,13,19,20};
		System.out.println(Arrays.toString(arr));
		for(int ele:arr)
			if(isPrime(ele))
			System.out.println(ele);

	}
	public static boolean isPrime(int ele){
		if(ele<2)
			return false;
		for(int i=2; i<ele; i++)
			if(ele%i==0)
			return false;
		return true;

}
}
