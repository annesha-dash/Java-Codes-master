package main.grade;

import main.user.*;
import main.student.*;
import main.course.*;
import main.connection.*;
import java.util.*;


public class GradeClass{

	private String gId;
	private String gCId;
	private String gSId;
	private String gMId;
	private String gFId;
	private int gGrade;

	public GradeClass(	String gId , String gCId , String gSId,	String gMId , 
						String gFId ,	int gGrade){


		this.gId = gId;
		this.gCId = gCId;
		this.gSId = gSId;
		this.gMId = gMId;
		this.gFId = gFId;
		this.gGrade = gGrade;

	}


	public void setGId(String gId){

		this.gId = gId;
	}
	public String getGId(){

		return this.gId ;
	}


	public void setCGId(String gCId){

		this.gCId = gCId;
	}
	public String getGCId(){

		return this.gCId ;
	}



	public void setGSId(String gSId){

		this.gSId = gSId;
	}
	public String getGSId(){

		return this.gSId ;
	}



	public void setGMId(String gMId){

		this.gMId = gMId;
	}
	public String getGMId(){

		return this.gMId ;
	}



	public void setGFId(String gFId){

		this.gFId = gFId;
	}


	public String getGFId(){

		return this.gFId ;
	}



	public void setGGrade(int gGrade){

		this.gGrade = gGrade;
	}
	public int getGGrade(){

		return this.gGrade ;
	}


	public static void gradeCourse(UserClass u){

		ArrayList<CourseClass> courseList = CourseClass.getTeacherCourses(u);

		for(CourseClass x : courseList){

			setAllGrade( x.getCId() );
		}

	}



	public static void setAllGrade(String cId){

		ArrayList<StudentClass> studentlist = StudentClass.viewCourseStudents(cId);


		for(StudentClass x : studentlist){

		MidGradeClass m1 = MidGradeClass.getMidGrade(cId , x.getSId());
		FinalGradeClass f1 = FinalGradeClass.getFinalGrade( cId , x.getSId() );

		getGrade(m1,f1,cId,x.getSId());
	}





	}

	public static void getGrade(MidGradeClass m,FinalGradeClass f,String cId ,String sId){

		double midMark ;
		double finalMark ;


		int[] mid = new int[3];
		mid[0] = m.getMQ1();
		mid[1] = m.getMQ2();
		mid[2] = m.getMQ3();
		Arrays.sort(mid);

		midMark = (mid[2]+mid[1]+m.getMAttendance()+m.getMPerformence()+ m.getMWritten() )*.4;

		int[] finalQuiz = new int[3];
		finalQuiz[0] = m.getMQ1();
		finalQuiz[1] = m.getMQ2();
		finalQuiz[2] = m.getMQ3();
		Arrays.sort(finalQuiz);
		finalMark = (finalQuiz[2]+finalQuiz[1]+f.getFAttendance()+f.getFPerformence()+ f.getFWritten() )*.6;

		ResultQuery.setGrade( (midMark+finalMark) , cId , sId );
	}



} 