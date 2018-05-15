class main{
	
	public static void main(String[] args)
	{
		
		Account a1=new Account("Pranto","01",10000);
		Account a2=new Account("sheehab","02",300000);
		
		
		a1.diposit(10000);
		
		a1.show();
		
		
		a1.withdraw(5000);
		
		a1.show();
		
		
		System.out.println("Transfering from a1 to a2");
		a1.transfer(5000,a2);
		a1.show();
		a2.show();
		
		
	}
	
	
	
}