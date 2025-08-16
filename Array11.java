import java.util.Arrays;
class Array11 
{
	public static void main(String[] args) 
	{
		
		int []arr1={10,20,30,40,50};
		int []arr2={60,70,80};

		int [] newArr=new int[(arr1.length)+(arr2.length)];
		for(int i=0, j=0;i<newArr.length; i++)
		{
			if(i<arr1.length)
				newArr[i]=arr1[i];
			else
				newArr[i]=arr2[j++];
		}
		int index=0;
		for(int ele:arr2)
			newArr[index++]=ele;
		System.out.println(Arrays.toString(newArr));
	}
}
