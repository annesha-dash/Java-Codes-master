class Main{
	
	
	public static void main(String[] args)
	{
		
		OverDraftAccount[] ab=new OverDraftAccount[3];
		 ab [0] =new OverDraftAccount("sheehab","01",10000,30000);
		
		 ab [1] =new OverDraftAccount("pranto","02",20000,20000);
		
		 ab [2] =new OverDraftAccount("ahmed","03",30000,10000);
		
		System.out.println(ab[0].interestRate());
		System.out.println(ab[1].interestRate());
		System.out.println(ab[2].interestRate());
		
	}
}