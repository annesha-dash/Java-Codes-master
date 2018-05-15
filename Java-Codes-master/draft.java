class OverDraftAccount extends Account{
	
	
	private final double overDraftLimitl;
	
	OverDraftAccount(){
		
		this.overDraftLimitl=0.00;
		
	}
	OverDraftAccount(String accName,String acid,double balance,double overDraftLimitl){
		super (accName,acid,balance);
		this.overDraftLimitl=overDraftLimitl;
		
		
	}
	public void showInfo()
	{
		this.show();
		System.out.println("The draft limit is : "+ this.overDraftLimitl);
		System.out.println("---------------------------------- ");
	}
	@Override
	public int interestRate(){
		
		
		if (this.getBalance() <= 10000)
		{
			
			return 9;
		}
		else return 11;
	}
	
	
}