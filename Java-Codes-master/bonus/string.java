class String1{
	
	
	public static void main(String[] args)
	{
		int i,j=0;
		String s1="hello";
		char []a=new char[10];
		for(i=s1.length()-1 ;i >=0 ;i--)
		{

			a[j]=s1.charAt(i);
			j++;
			
		}
		
		for(i=0;i<=s1.length()-1;i++)
		{
			System.out.print(a[i]);
			
		}
		
		
	}
}