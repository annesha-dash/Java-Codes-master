class User{
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String contact;
	private String email;
	
	
	public void setFirstName(String firstName){
		
		this.firstName = firstName;
		
	}
	
	
	public String getFirstName(){
		
		return this.firstName;
		
	}
	
	public void setLastName(String lastName){
		
		this.lastName = lastName;
		
	}
	
	
	public String getLastName(){
		
		return this.lastName;
		
	}
	
	
		public void setUserName(String userName){
		
		this.userName = userName;
		
	}
	
	
	public String getUserName(){
		
		return this.userName;
		
	}
	
		public void setPassword(String password){
		
		this.password = password;
		
	}
	
	
	public String getPassword(){
		
		return this.password;
		
	}
	
	
	public void setContact(String contact){
		
		this.contact = contact;
		
	}
	
	
	public String getContact(){
		
		return this.contact;
		
	}
	
	public void setEmail(String email){
		
		this.email = email;
		
	}
	
	
	public String getEmail(){
		
		return this.email;
		
	}
	
	
	public User(String firstName,String lastName,String userName,String password,String contact,String email ){
		
			this.firstName = firstName;
			this.lastName = lastName;
			this.userName = userName;
			this.password = password;
			this.contact = contact;
			this.email = email;
		
		
	}
	
	
	
	
}