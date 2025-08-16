import java.util.HashSet;
import java.util.Arrays;
class Array16 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<int [] > set=new LinkedHashset<>();

		int arr[]={1,2,3,4,5};
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				int []newArr={arr[i],arr[j]};
				Arrays.sort(newArr);
				set.add(newArr);


			}
		}

		int maxSum=Integer.MAX_VALUE;
		int arr1=null;
		for(int ele[]:set){

			int sum=ele[0]+ele[1];
			if(sum<maxSum){
				maxSum=sum;
				arr1=ele;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(maxSum);

			

	}
}
