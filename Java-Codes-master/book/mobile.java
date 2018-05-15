class Contact{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender; // M or F
	Address address;
	
	public void setPersonName(String personName)
	{
		this.personName=personName;
		
	}
	public String getPersonName()
	{
		return this.personName;
		
	}
	public void setPersonId(String personId)
	{
		this.personId=personId;
		
	}
	
	public String getPersonId()
	{
		return this.personId;
		
	}
	
	public void setAge(int age)
	{
		this.age=age;
		
	}
	public int getAge()
	{
		return this.age;
		
	}
	
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber=mobileNumber;
		
	}
	
	public String getMobileNumber()
	{
		return this.mobileNumber;
		
	}
	
	public void setGender(char gender)
	{
		this.gender=gender;
		
	}
	public char getGender()
	{
		return this.gender;
		
	}
	
	public Contact()
	{
		this.personName=null;
		this.personId=null;
		this.age=0;
		this.mobileNumber=null;
		this.gender='a';
		
		
	}
	public Contact(String personName,String personId,int age,String mobileNumber,char gender)
	{
		this.personName=personName;
		this.personId=personId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
		
	}
	public void showPersonInfo()
	{
		System.out.println("The person's name is : "+this.personName);
		System.out.println("The person's ID is : "+this.personId);
		System.out.println("The person's age is : "+this.age);
		
		System.out.println("The person's mobile number is : "+this.mobileNumber);
		this.detectMobileOperator();
		System.out.println("The person's gender is : "+this.gender);
		System.out.println("----------------------------------------------------------------------");
	}
	public void detectMobileOperator()
	{
		if(this.mobileNumber.regionMatches(0, "017", 0, 2))
		{
			
			System.out.println("The person's oparetor is GrameenPhone.");
		}
		else if(this.mobileNumber.regionMatches(0, "019", 0, 2))
		{
			
			System.out.println("The person's oparetor is Banglalink.");
		}
		else if(this.mobileNumber.regionMatches(0, "018", 0,2))
		{
			
			System.out.println("The person's oparetor is Robi.");
		}
		
		else if(this.mobileNumber.regionMatches(0, "016", 0, 2))
		{
			
			System.out.println("The person's oparetor is Airtel.");
		}
		else
		{
			
			System.out.println("The person's oparetor is unknown.");
		}
	}
	
}