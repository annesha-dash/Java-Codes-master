class Main
{
		public static void main(String []args)
	{
		Account ac=new Account("AirBD","192932",1000000);
		Admin admin=new Admin("Faisal","Zigatola,Dhanmondi,Dhaka","018388881823","12/04/1995",ac);
		admin.createManager("Nakib","14-321",'M',"Dhanmondi,Dhaka","18/03/1996","1002020283654","01657529957","C-01");
		admin.createManager("Farabi","14-221",'M',"Dhanmondi,Dhaka","20/05/1996","100434533648","01654993793","C-02");
		BusinessClass t1=new BusinessClass("Business Class",1200,"B1 -01");
		EconomyClass t2=new EconomyClass("Economy Class",1000,"E1 -01");
		BusinessClass t3=new BusinessClass("Business Class",1400,"B2 -01");
		EconomyClass t4=new EconomyClass("Economy Class",1100,"E2 -01");
		admin.createFlight("Spice jet","101","10/4/2017","Monday","Dhaka","Singapur","10:30 AM","2:00 PM","A-19",t1,1,t2,2);
		admin.createFlight("BD-Airlines","102","11/4/2017","Monday","Dhaka","Malaysia","10:00 AM","2:30 PM","A-05",t3,100,t4,50);
		
		//admin.seeFlight();
		//admin.seeManager();
		//admin.seeAccountInfo();
		
		
		//admin.managerList[0].checkNonRserveSit(admin.flightList[0]);
        Customer c1=admin.managerList[0].createCustomer("Nisa","1432",19,"Banani,Dhaka","0003948575838","9995761232563","01842948285");
		Customer c2=admin.managerList[0].createCustomer("Sheehab","1432",19,"Banani,Dhaka","0003948575838","9995761232563","01842948285");
		Customer c3=admin.managerList[0].createCustomer("Bushra","1432",19,"Banani,Dhaka","0003948575838","9995761232563","01842948285");
		//admin.managerList[0].searchByDate("10/4/2017");
		//admin.managerList[0].checkPrice(admin.flightList[0]);
		//admin.ecoPriceSet(admin.flightList[0],1500);
		//admin.managerList[0].checkPrice(admin.flightList[0]);
		//admin.managerList[0].checkNonRserveSit(admin.flightList[0]);
		//double paid=admin.managerList[0].costCalculate(admin.flightList[0],2,1);
		//Payment p=admin.managerList[0].createPayment("P-01","Cash",paid,"AC:0011");
		  boolean b=admin.managerList[0].confirmBooking(admin.flightList[0],c1,0,2);
		  if(b==true)
		  {
			admin.managerList[0].confirmReserve("R-01","10/05/2017",admin.flightList[0],c1);
		  }
		 // admin.seeAccountInfo();
		  boolean c=admin.managerList[0].confirmBooking(admin.flightList[1],c2,10,5);
		  if(c==true)
		  {
			admin.managerList[0].confirmReserve("R-01","10/05/2017",admin.flightList[1],c2);  
		  }
		   //admin.seeAccountInfo();
		  // admin.managerList[0].checkReserveTicket(admin.flightList[0]);
		  // admin.managerList[0].checkReserveTicket(admin.flightList[1]);
		   admin.managerList[0].seeCustomer(admin.flightList[1]);
		   admin.managerList[0].addTicket(admin.flightList[1],c2,3,0);
		    admin.managerList[0].seeCustomer(admin.flightList[1]);
		admin.seeAccountInfo();
		
	}
}