class EconomyClass extends Ticket
{

	public EconomyClass(String ticketId,String seatName)
	{
		this.ticketType="Economy";
		this.seatName=seatName;
		this.ticketId=ticketId;
		this.confirmed= false;
	
	}
	public void showEcoTicket()
	{
		System.out.println("Ticket ID :"+this.ticketId);
		System.out.println("Ticket SitNumber :"+seatName.seatName);
	}


	public confirm(){

		this.confirmed=true;
	}
}
