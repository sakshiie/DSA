class DuplicateCharacters 
{
	public static void main(String[] args) 
	{
		String str="sakshii";
		int count=0;
		char ch[]=str.toCharArray();
		for (int i=0;i<ch.length ;i++ )
		{
			for (int j=i+1;j<ch.length ;j++ )
			{
				if(ch[i]==ch[j]){
					System.out.print("Dupliactes: "+ch[j]);
					count++;
			}
		}


	}
	System.out.println("number of cnt "+count);
}
}
