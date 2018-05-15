class Account{
	
	private String accName;
	
	private String acId;
	
	private double balance;
	
	
	
	
	
	public void setAccName(String accName)
	{
		
		this.accName=accName;
		
	}
	public void setAccId(String acId)
	{
		
		this.acId=acId;
		
	}
	public void setBalance(double balance)
	{
		
		this.balance=balance;
		
	}
	
	
	
	
	
	
	public String getAccName( )
	{
		
		return this.accName;
		
	}
	public String getAccId( )
	{
		
		return this.acId;
		
	}
	public double getBalance( )
	{
		
		return this.balance;
		
	}
	
	
	
	
	public Account()
	{
		accName=null;
		acId=null;
		balance=0.0;
		
		
	}
	public Account(String accName,String acId, double balance)
	{
		this.accName=accName;
		this.acId=acId;
		this.balance=balance;
		
		
	}
	
	
	public void show()
	{
		
		System.out.println("The account name:"+this.accName);
		
		System.out.println("The account id:"+this.acId);
		
		System.out.println("The account balance:"+this.balance);
		
		
	}
	
	
	
	
	public void diposit(double balance){
		
			this.balance += balance;
			
		
	}
	public void withdraw(double balance){
		
			this.balance -= balance;
			
	}
	
	public void transfer(double amount, Account receiver)
	{
		
		this.balance=this.balance-amount;
		System.out.println("Transfering from "+this.accName+" to "+receiver.getAccName());
		System.out.println("Transfered amount :"+amount);
		receiver.diposit(amount);
	}

}