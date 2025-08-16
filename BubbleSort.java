class BubbleSort 
{
	public static void main(String[] args) 
	{
		int arr[]={9,7,8,2,4,3,1};
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
	}
	printArr(arr);


}

public static void printArr(int arr[]){
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
}
}
}
