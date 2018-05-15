class ReserveTicket
{
	protected String reserveId;
	protected String reserveDate;
	protected Flight flight;
	protected Customer customer;
	
	
	public ReserveTicket(String reserveId,String reserveDate,Flight f,Customer c)
	{
		this.reserveId=reserveId;
		this.reserveDate=reserveDate;
		this.flight=f;
		this.customer=c;
	} 	
}