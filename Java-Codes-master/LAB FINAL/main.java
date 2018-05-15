class Main{
	
	
	public static void main(String[] args)
	{
		
		Address p1=new Address("13/A","35","1205");
		
		Address p2=new Address("17/A","32","1215");
		
		Address p3=new Address("23/A","23","1200");
		
		OverDraftAccount[] ab=new OverDraftAccount[3];
		
		
			 ab [0] =new OverDraftAccount("sheehab","01",1000,30000,p1);
			
			 ab [1] =new OverDraftAccount("pranto","02",2000,20000,p2);
			
			 ab [2] =new OverDraftAccount("ahmed","03",3000,10000,p3);
			
			
			
		ab [0].showOverDraftAccountInfo();
		ab [1].showOverDraftAccountInfo();
		ab [2].showOverDraftAccountInfo();
		ab[0].transfer(ab[1],300);
		ab [0].showOverDraftAccountInfo();
		
		ab[1].withdraw(2500.00);
		ab [1].showOverDraftAccountInfo();

	}
}