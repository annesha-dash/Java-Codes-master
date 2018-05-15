package main.user;


import main.connection.*;

public class UserClass{


	private String uId;
	private String password;
	private String fId;

	public UserClass(){};


	
	public UserClass(String uId , String password , String fId){


		this.uId = uId;
		this.password = password;
		this.fId = fId;
	}

	public UserClass(String uId ,String password ){

		this.uId = uId;
		this.password = password;
		
		
	}




	public void setStudentFId(){


		this.fId = ResultQuery.getStudentFId(this.uId , this.password);
	}
	public void setAdminFId(){


		this.fId = ResultQuery.getAdminFId(this.uId , this.password);
	}
	public void setTeacherFId(){


		this.fId = ResultQuery.getTeacherFId(this.uId , this.password);
		
	}








	public void setUId(String uId){


		this.uId = uId;
	}

	public String getUId(){

		return this.uId;

	}

	public void setPassword(String password){


		this.password = password;
	}

	public String getPassword(){

		return this.password;

	}


	public void setFId(String uId){


		this.fId = fId;
	}

	public String getFId(){

		return this.fId;

	}


	




}