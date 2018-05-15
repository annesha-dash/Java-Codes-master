package main.grade;

import main.connection.*;

public class MidGradeClass{

	private String mId;
	private int mQ1;
	private int mQ2;
	private int mQ3;
	private int mAttendance;
	private int mPerformance;
	private int mWritten;

	public MidGradeClass(){}

	public MidGradeClass(int mQ1 ,int mQ2 ,int mQ3 ,int mAttendance ,
										int mPerformance , int mWritten){


		this.mQ1 = mQ1;
		this.mQ2 = mQ2;
		this.mQ3 = mQ3;
		this.mAttendance = mAttendance ; 
		this.mPerformance = mPerformance;
		this.mWritten = mWritten;

	}

	public MidGradeClass(String mId ,int mQ1 ,int mQ2 ,int mQ3 ,int mAttendance ,
										int mPerformance , int mWritten){

		this.mId = mId;
		this.mQ1 = mQ1;
		this.mQ2 = mQ2;
		this.mQ3 = mQ3;
		this.mAttendance = mAttendance ; 
		this.mPerformance = mPerformance;
		this.mWritten = mWritten;

	}


	public void setMId(String mId){

		this.mId = mId ;
	}

	public String getMId(){

		return mId;
	}





	public void setMQ1(int mQ1){

		this.mQ1 = mQ1 ;
	}

	public int getMQ1(){

		return mQ1;
	}






	public void setMQ2(int mQ2){

		this.mQ2 = mQ2 ;
	}

	public int getMQ2(){

		return mQ2;
	}





	public void setMQ3(int mQ3){

		this.mQ3 = mQ3 ;
	}

	public int getMQ3(){

		return mQ3;
	}




	public void setMAttendance(int mAttendance){

		this.mAttendance = mAttendance ;
	}

	public int getMAttendance(){

		return mAttendance;
	}



	public void setMPerformence(int mPerformance){

		this.mPerformance = mPerformance ;
	}

	public int getMPerformence(){

		return mPerformance ;
	}


	public void setMWritten(int mWritten){

		this.mWritten = mWritten ;
	}

	public int getMWritten(){

		return mWritten ;
	}



	public static MidGradeClass getMidGrade(String cId , String sId){

		return ResultQuery.getMidGrade(cId , sId);

	}



}
