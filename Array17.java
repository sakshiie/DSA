import java.util.Arrays;
class Array17 
{
	public static void main(String[] args) 
	{
		int arr[]={1,3,5,2,7,3,7,3,8,6,3,9};
		int len=arr.length;
		boolean [] track=new boolean[len];
		
		for(int i=0; i<len; i++){
			int cnt=0;
			for(int j=0; j<len; j++){
				if(arr[i]==arr[j] && track[j]!=true){
					cnt++;
					track[j]=true;
				
			}
			}
			if(cnt!=0)

			System.out.println(arr[i]+" - "+cnt);
		}
	
	}
	}
