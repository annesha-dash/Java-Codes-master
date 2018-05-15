package main.grade;

import main.connection.*;


public class FinalGradeClass{

	private String fId;
	private int fQ1;
	private int fQ2;
	private int fQ3;
	private int fAttendance;
	private int fPerformance;
	private int fWritten;


	public FinalGradeClass(){}


	public FinalGradeClass(String fId,int fQ1 ,int fQ2 ,int fQ3 ,int fAttendance ,
										int fPerformance , int fWritten){

		this.fId = fId;
		this.fQ1 = fQ1;
		this.fQ2 = fQ2;
		this.fQ3 = fQ3;
		this.fAttendance = fAttendance ; 
		this.fPerformance = fPerformance;
		this.fWritten = fWritten;

	}


	public FinalGradeClass(int fQ1 ,int fQ2 ,int fQ3 ,int fAttendance ,
										int fPerformance , int fWritten){

	
		this.fQ1 = fQ1;
		this.fQ2 = fQ2;
		this.fQ3 = fQ3;
		this.fAttendance = fAttendance ; 
		this.fPerformance = fPerformance;
		this.fWritten = fWritten;

	}


	public void setFId(String fId){

		this.fId = fId ;
	}

	public String getFId(){

		return fId;
	}





	public void setFQ1(int fQ1){

		this.fQ1 = fQ1 ;
	}

	public int getFQ1(){

		return fQ1;
	}






	public void setFQ2(int fQ2){

		this.fQ2 = fQ2 ;
	}

	public int getFQ2(){

		return fQ2;
	}





	public void setFQ3(int fQ3){

		this.fQ3 = fQ3 ;
	}

	public int getFQ3(){

		return fQ3;
	}




	public void setFAttendance(int fAttendance){

		this.fAttendance = fAttendance ;
	}

	public int getFAttendance(){

		return fAttendance;
	}



	public void setFPerformence(int fPerformance){

		this.fPerformance = fPerformance ;
	}

	public int getFPerformence(){

		return fPerformance ;
	}


	public void setFWritten(int mWritten){

		this.fWritten = fWritten ;
	}

	public int getFWritten(){

		return fWritten ;
	}



	public static FinalGradeClass getFinalGrade(String cId , String sId){

		return ResultQuery.getFinalGrade(cId , sId);

	}



	
}
