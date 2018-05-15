class Account{
	
	private String accName;
	private String acid;
	private double balance;
	private Address address;
	
	public void setBalance(double balance)
	{
		
		this.balance=balance;
	}
	
	
	public double getBalance()
	{
		
		return this.balance;
	}
	
	
	public Account()
	{
		
		this.accName=null;
		this.acid=null;
		this.balance=0.00;
	}
	
	public Account(String accName,String acid,double balance,Address address)
	{
		
		this.accName=accName;
		this.acid=acid;
		this.balance=balance;
		this.address=address;
	}
	
	public void deposit(double balance)
	{
		this.balance += balance;
		
		
	}
	
	
	public  void withdraw(double balance)
	{
		
		if( this.balance >= -500 )
		{
			
			this.balance -= balance;
		}
		
		
	}
	
	
	public void transfer(Account a1,double balance)
	{
		
			this.balance= this.balance-balance;
			a1.balance=a1.balance+balance;		
		
		
		
	}
	
	public void showAccountInfo()

	{
		
		System.out.println("The account name is : "+this.accName);
		
		System.out.println("The account id is : "+this.acid);
		
		System.out.println("The account balance is : "+this.balance);
		
		System.out.println(address.getHouseNo());
		
	}
	
	
	
}