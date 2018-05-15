abstract class Account{
	
	private String accName;
	private String acid;
	private double balance;
	
	
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
	
	public Account(String accName,String acid,double balance)
	{
		
		this.accName=accName;
		this.acid=acid;
		this.balance=balance;
	}
	
	public void deposit(double balance)
	{
		this.balance += balance;
		
		
	}
	
	
	public  void withdraw(double balance)
	{
		
			this.balance -= balance;
		
		
	}
	
	
	public void transfer(Account a1,double balance)
	{
		
			this.balance= this.balance-balance;
			a1.balance=a1.balance+balance;		
		
		
		
	}
	
	public void show()
	{
		
		System.out.println("The account name is : "+this.accName);
		
		System.out.println("The account id is : "+this.acid);
		
		System.out.println("The account balance is : "+this.balance);
		
		
	}
	public void interestRate(){}
	
	
}