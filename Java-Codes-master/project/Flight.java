class Flight
{
	protected String flightName;
	private String flightId;
	protected String flightDate;
	private String day;
	protected String startFrom;
	protected String destination;
	protected String departureTime;
	private String arrivalTime;
	private String gateNumber;
	protected int bTicketquantity;
	protected int eTicketquantity;
	protected int ticketQuantity;
	protected BusinessClass [] bTicketList;
	protected EconomyClass [] eTicketList;
	protected double ecoPrice;
	protected double busiPrice;
	protected int tc=0;
	protected int btc=0;
	protected int etc=0;
	protected int cc=0;



	public Flight(String flightName,String flightId,String flightDate,String day,String startFrom,String destination,String departureTime,String arrivalTime,String gateNumber,BusinessClass bTicket,int bTicketquantity,EconomyClass eTicket,int eTicketquantity)
	{
		this.flightName=flightName;
		this.flightId=flightId;
		this.flightDate=flightDate;
		this.day=day;
		this.startFrom=startFrom;
		this.destination=destination;
		this.departureTime=departureTime;
		this.arrivalTime=arrivalTime;
		this.gateNumber=gateNumber;
		this.ticketQuantity=bTicketquantity+eTicketquantity;

		this.bTicketquantity=bTicketquantity;
		this.eTicketquantity=eTicketquantity;
		this.bTicketList = new BusinessClass[bTicketquantity];
		int x = 0;
		int y = 0;
		for(int i = 0 ; i < bTicketquantity; i++){

			bTicketList[i] = new BusinessClass("00"+x++ , "00"+y++ );

		}
		this.eTicketList=new EconomyClass[eTicketquantity];
		 x = 0;
		 y = 0;
		for(int i = 0 ; i < eTicketquantity; i++){
			bTicketList[i] = new EconomyClass("00"+x++ , "00"+y++ );

		}


	}
	public void showFlight()
	{
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println("Flight Name : "+this.flightName);
		System.out.println("Flight Id : "+this.flightId);
		System.out.println("Flight Date : "+this.flightDate);
		System.out.println("Flight Day : "+this.day);
		System.out.println("Flight Start From : "+this.startFrom);
		System.out.println("Flight Destination : "+this.destination);
		System.out.println("Flight Departure Time : "+this.departureTime);
		System.out.println("Flight Arrival Time : "+this.arrivalTime);
		System.out.println("Total BusinessClass Ticket : "+this.bTicketquantity);
		System.out.println("BusinessClass Ticket Price : "+this.businessTicket.ticketPrice);
		System.out.println("Total EconomyClass Ticket : "+this.eTicketquantity);
		System.out.println("EconomyClass Ticket Price: "+this.economyTicket.ticketPrice);
		System.out.println("Wating Gate Number : "+this.gateNumber);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
	}

	public boolean check()
	{
		if(this.ticketQuantity==this.tc)
		{
			return false;
		}
		else
		{return true;}
	}

	public void calculateBusinessTicket(double quantity)
	{
		double total=this.businessTicket.ticketPrice*quantity;
		System.out.println("Single BusinessClass Ticket Price :"+this.businessTicket.ticketPrice+" Taka");
		System.out.println("Total Cost will be :"+total+" Taka");
	}
	public void calculateEconomyTicket(double  quantity)
	{
		double total=this.economyTicket.ticketPrice*quantity;
		System.out.println("Single EconomyClass Ticket Price :"+this.economyTicket.ticketPrice+" Taka");
		System.out.println("Total Cost will be :"+total+" Taka");
	}
	public int checkEcoBook(int quantity)
	{
		if(this.ticketQuantity==this.tc)
		{
			return 1;
		}
		else if(this.ticketQuantity<(this.tc+quantity))
		{
			return 2;
		}
		else
		{ return 3;}
	}

	public EconomyClass[] addEcoTicket(int quantity)
		{


			if((etc+quantity) <= eTicketquantity){
			EconomyClass[] tickts = new EconomyClass[quantity];
			int x=0;
			for(int i = etc ; i< etc+quantity; i++ ){

				tickts[x] = eTicketList[i];
				eTicketList[i].confirm();
				x++;
			}

			etc += quantity;
		}

		return tickts;

	}
	
	public BusinessClass[] addBusiTicket(int quantity)
		{
			if((btc+quantity) <= bTicketquantity){
			BusinessClass[] tickts = new BusinessClass[quantity];
			int x=0;

			for(int i = btc ; i< btc+quantity; i++ ){
				tickts[x] = bTicketList[i];
				bTicketList[i].confirm();
				x++;
			}

			btc += quantity;
		}
		return tickts;
		}


}
