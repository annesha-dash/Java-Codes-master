class Customer
{
	protected String customerName;
	protected String customerId;
	private int age;
	private String cusAddress;
	private String passportNo;
	private String customerNID;
	private String phoneNumber;
	protected Payment payment;
	private double paidAmount;

	public Customer(String customerName,String customerId,int age,String cusAddress,String passportNo,String customerNID,String phoneNumber)
	{
		this.customerName=customerName;
		this.customerId=customerId;
		this.age=age;
		this.cusAddress=cusAddress;
		this.passportNo=passportNo;
		this.customerNID=customerNID;
		this.phoneNumber=phoneNumber;

	}


	public void setPayment(Payment p)
	{
		this.payment=p;
	}
}
