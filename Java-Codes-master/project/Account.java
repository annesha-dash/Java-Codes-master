class Account
{
	private String accName;
	private String accId;
	private double amount;
	
	public Account(String accName,String accId,double amount)
	{
		this.accName=accName;
		this.accId=accId;
		this.amount=amount;
	}
	
   public void showAccInfo()
   {
	   System.out.println("Account Name : "+this.accName);
	   System.out.println("Account Id : "+this.accId);
	   System.out.println("Current Balance : "+this.amount);
   }
   public void deposit(double money)
   {
	   this.amount+=money;
   }
}
