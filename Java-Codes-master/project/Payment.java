class Payment
{
	private String paymentId;
	private String paymentType;
	private String accountNumber;
	protected double paidAmount;

	public Payment(String paymentId,String paymentType,double paidAmount,String accountNumber)
	{
		this.paymentId=paymentId;
		this.paymentType=paymentType;
		this.paidAmount=paidAmount;
		this.accountNumber=accountNumber;
	}
	public void showPayment()
	{
		System.out.println("Payment Id :"+this.paymentId);
		System.out.println("Payment Type :"+this.paymentType);
		System.out.println("Account Number :"+this.accountNumber);
		System.out.println("Total paid Amount :"+this.paidAmount);
	}
	public void addPayment(double amount)
	{
		this.paidAmount+=amount;

	}
	public static double calculateCost(int quantity,int price)
	{
		return Total = price*quantity;
	}


}
