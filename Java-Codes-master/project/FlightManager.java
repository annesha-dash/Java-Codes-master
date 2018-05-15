import java.util.ArrayList;
class FlightManager
	{
		private String managerName;
		private String managerId;
		private char gender;
		private String managerAddress;
		private String managerDOB;
		private String managerNID;
		private String phoneNumber;
		private String counterNumber;
		//protected static ArrayList <ReserveTicket> reserveList = new ArrayList <ReserveTicket>();
		private ReserveTicket [] reserveList = new ReserveTicket[1000];
		protected int rc=0;

		public FlightManager(String managerName,String managerId,char gender,String managerAddress,String managerDOB,String managerNID,String phoneNumber,String counterNumber)
		{
			this.managerName=managerName;
			this.managerId=managerId;
			this.gender=gender;
			this.managerAddress=managerAddress;
			this.managerDOB=managerDOB;
			this.managerNID=managerNID;
			this.phoneNumber=phoneNumber;
			this.counterNumber=counterNumber;

		}

		 public void showManager()
		{
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("Manager Name : "+this.managerName);
			System.out.println("Manager Id : "+this.managerId);
			System.out.println("Manager Gender : "+this.gender);
			System.out.println("Manager Address : "+this.managerAddress);
			System.out.println("Manager DOB : "+this.managerDOB);
			System.out.println("Manager NID : "+this.managerNID);
			System.out.println("Manager PhoneNumber : "+this.phoneNumber);
			System.out.println("Manager Counter Number : "+this.counterNumber);
			System.out.println("++++++++++++++++++++++++++++++++++++++");
		}

	    public void checkPrice(Flight f)
		{
			System.out.println("--------------------------------------");
				System.out.println("Flight Name :"+f.flightName);
				System.out.println("--------------------------------------");
			System.out.println("BusinessClass Ticket Price :"+f.businessTicket.ticketPrice+" Taka");
			System.out.println("EconomyClass Ticket Price :"+f.economyTicket.ticketPrice+" Taka");

		}
		public void checkNonRserveSit(Flight f)
		{
			if(f.check()==false)
			{   System.out.println("--------------------------------------");
				System.out.println("Flight is full !!");
				System.out.println("--------------------------------------");
			}
			else if(f.check()==true)
			{
	    	int x=f.bTicketquantity-f.btc;
				int y=f.eTicketquantity-f.etc;

				System.out.println("--------------------------------------");
				System.out.println(f.flightName+" Flight Ticket Information !");
				System.out.println("--------------------------------------");
				System.out.println();
				System.out.println("#########################################");;
				System.out.println("Flight have "+x+" Business class Sits");
				System.out.println("Flight have "+y+" Economy class Sits");
				System.out.println("#########################################");

			}
		}
		public boolean confirmBooking(Flight f,Customer c,int bquantity,int equantity)
		{
				boolean a=false,b=false;
				System.out.println("--------------------------------------");
			   System.out.println("      Booking Information !! ");
			   System.out.println("--------------------------------------");

					   	if(f.eTicketquantity<(f.etc+equantity))
								{
								int x=f.eTicketquantity-f.etc;
								System.out.println("Sorry this flight have "+x+" Economy Class seats");
								}
							else
								{a=true;}


							if(f.bTicketquantity<(f.btc+bquantity))
							{
							int y=f.bTicketquantity-f.btc;

							System.out.println("Sorry this flight have "+y+" Business Class seats");

							}
							else
							{b=true;}


			if(a==true && b==true)
			{
				EconomyClass[] eTickets = new EconomyClass[equantity];

				BusinessClass[] bTickets = new BusinessClass[bquantity];

				Ticket[] tickets = new Ticket[equantity+bquantity];

				eTickets = f.addEcoTicket(equantity);

				bTickets = f.addBusiTicket(bquantity);
				int i=0;
				for( ; i < equantity ; i++){

					tickets[i] = eTickets[i];

				}

				for(int j= 0 ; j <bquantity ; j++){

					tickts[i+j] = bquantity[j];

				}

				double cost;
				cost = Payment.costCalculate(f.ecoPrice , equantity);
				cost += Payment.costCalculate(f.busiPrice , bquantity);

				Payment payment = new Payment();

				Transaction tarns = new Transaction();

				Transaction.transaction[Transaction.x++] = trans;


				return true;
			}

			else
			{
				System.out.println("?????????????????????????????????????????");
				System.out.println("Booking Unsuccessful !! ");
	      System.out.println("?????????????????????????????????????????");
				return false;
			}

		}

		

	}
