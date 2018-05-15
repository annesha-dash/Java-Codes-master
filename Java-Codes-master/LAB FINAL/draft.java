class OverDraftAccount extends Account{
	
	
	private final double overDraftLimitl;
	
	OverDraftAccount(){
		
		this.overDraftLimitl=0.00;
		
	}
	OverDraftAccount(String accName,String acid,double balance,double overDraftLimitl,Address a1){
		super (accName,acid,balance,a1);
		this.overDraftLimitl=overDraftLimitl;
		
		
	}
	public void showOverDraftAccountInfo()
	{
		this.showAccountInfo();
	
		System.out.println("The draft limit is : "+ this.overDraftLimitl);
		System.out.println("---------------------------------- ");
	}
	
	public void withdraw(double amount){
		double a=this.getBalance();
		if(amount < this.overDraftLimitl && a >= -500 )
		{
			
			this.setBalance(a-amount);
		}
		
	} 
	
}