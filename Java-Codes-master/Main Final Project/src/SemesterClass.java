package main.course;
import main.connection.*;


public class SemesterClass{




	private String sId;
	private String sName;

	public SemesterClass(String sId,String sName){

		this.sId = sId;
		this.sName = sName;
	}

	public SemesterClass(String sName){

	
		this.sName = sName;
	}

	public void setSId(String sId){

		this.sId = sId;
	}



	public String getSId(){

		return this.sId ;
	}


	public void setSName(String sName){

		this.sName = sName;
	}



	public String getSName(){

		return this.sName ;
	}


	public static void createSemester(SemesterClass s1){


		ResultQuery.createSemester(s1.getSName());

	}


}