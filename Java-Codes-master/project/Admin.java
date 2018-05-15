class Admin
{
	protected String  adminName;
	private String adminAddress;
	private  String phoneNumber;
	private  String dOB;
	protected static Account acc;//Is it good to make this static
	protected static Flight []flightList;
	protected  static int fc=0;
	protected static FlightManager [] managerList;
	protected static int mc=0;
	
	public Admin(String adminName,String adminAddress,String phoneNumber,String dOB,Account ac)
	{
		this.adminName=adminName;
		this.adminAddress=adminAddress;
		this.phoneNumber=phoneNumber;
		this.dOB=dOB;
		this.acc=ac;
		this.flightList= new Flight[100000];
		this.managerList=new FlightManager[100];
	}
	public void createFlight(String flightName,String flightId,String flightDate,String day,String startFrom,String destination,String departureTime,String arrivalTime,String gateNumber,BusinessClass t1,int bTicketquantity,EconomyClass t2,int eTicketquantity)
	{
		this.flightList[fc]=new Flight(flightName,flightId,flightDate,day,startFrom,destination,departureTime,arrivalTime,gateNumber,t1,bTicketquantity,t2,eTicketquantity);
		fc++;
	}

	public void seeFlight()
	{
		System.out.println();
		System.out.println("======================================");
		System.out.println("->->->->->->Flight List<-<-<-<-<-<-");
		System.out.println("======================================");
		for(int i=0;i<fc;i++)
		{
			this.flightList[i].showFlight();
		}
		System.out.println("--------------------------------------");
		System.out.println();
		
	}
	public void seeManager()
	{
		System.out.println();
		System.out.println("======================================");
		System.out.println("->->->->->->Manager List<-<-<-<-<-<-");
		System.out.println("======================================");
		for(int i=0;i<mc;i++)
		{
		this.managerList[i].showManager();
		}
		System.out.println("--------------------------------------");
		System.out.println();
	}
	public void deleteFlight()
	{
		
	}
	public void createManager(String managerName,String managerId,char gender,String managerAddress,String managerDOB,String managerNID,String phoneNumber,String counterNumber)
	{
		this.managerList[mc]=new FlightManager(managerName,managerId,gender,managerAddress,managerDOB,managerNID,phoneNumber,counterNumber);
		mc++;
	}
	
	public void ecoPriceSet(Flight f,double Price)
	{
		f.economyTicket.ticketPrice=Price;
	}
	public void busiPriceSet(Flight f,double Price)
	{
		f.businessTicket.ticketPrice=Price;
	}
	
	/*public void createbusinessTicket(Flight f)
	{
		Ticket t1=new BusinessClass("Business Class",700,"B - ");
	}
	
	public void createEconomyTicket(Flight f)
	{
	   Ticket t2=new EconomyClass("Economy Class",1000,"E - ");	
	}*/

	public void seeAccountInfo()
	{
		System.out.println("--------------------------------------");
		System.out.println("       Account Information  ");
		System.out.println("--------------------------------------");
		System.out.println("##################################");
		acc.showAccInfo();
		System.out.println("##################################");
	}
}



