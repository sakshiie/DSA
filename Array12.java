import java.util.Arrays;
class Array12 
{
	public static void main(String[] args) 
	{
		int arr[]={1,3,0,4,0,5,0,7};
		int [] newArr=new int [arr.length];

		int index=0;
		for(int ele:arr)
			if(ele!=0)
			newArr[index++]=ele;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}
}a