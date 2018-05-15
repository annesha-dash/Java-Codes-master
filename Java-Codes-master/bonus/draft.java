class OverDraftAccount extends Account{
	
	
	private final double OVERDRAFT_LIMIT;
	
	OverDraftAccount(){
		
		this.OVERDRAFT_LIMIT=0.00;
		
	}
	OverDraftAccount(String accName,String acid,double balance,double OVERDRAFT_LIMIT,Address a1){
		super (accName,acid,balance,a1);
		this.OVERDRAFT_LIMIT=OVERDRAFT_LIMIT;
		
		
	}
	public void showOverDraftAccountInfo()
	{
		this.showAccountInfo();
	
		System.out.println("The draft limit is : "+ this.OVERDRAFT_LIMIT);
		System.out.println("---------------------------------- ");
	}
	
	public void withdraw(double amount){
		//double a=this.getBalance();
		this.setBalance(this.getBalance()-amount);
		if(amount > this.OVERDRAFT_LIMIT && this.getBalance() <= -500 )
		{
			this.setBalance(this.getBalance()+amount);
			
		}
		
	} 
	
}