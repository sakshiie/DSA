class RevString 
{
	public static void main(String[] args) 
	{
		String str="hii";
		String rev="";
		char a[]=str.toCharArray();
		int len=a.length-1;

		for(int i=len; i>=0; i--){
			rev=rev+a[i];


	}
	System.out.println(rev);
}

}