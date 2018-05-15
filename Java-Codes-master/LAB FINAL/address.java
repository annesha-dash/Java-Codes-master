class Address{
	
	private String houseNo;
	private String roadNo;
	private String area;
	
	public String getHouseNo()
	{
		return this.houseNo;
		
	}
	public String getroadNo()
	{
		return this.roadNo;
		
	}
	public String getarea()
	{
		return this.area;
		
	}
	public Address()
	{
		
		this.houseNo=null;
		this.roadNo=null;
		this.area=null;
		
	}
	
	
	public Address(String houseNo,String roadNo,String area)
	{
		
		this.houseNo=houseNo;
		this.roadNo=roadNo;
		this.area=area;
		
	}

	public Address getAddress()
	{
		
		return this ;
		
	}

	
}