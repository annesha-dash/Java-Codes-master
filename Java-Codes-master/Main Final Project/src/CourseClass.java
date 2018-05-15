package main.course;

import java.util.*;
import java.text.*;
import main.connection.*;
import main.user.*;
import main.admin.*;
import main.teacher.*;
public class CourseClass {


	private String cId ;
	private String name ;
	private int seat;
	private String section;
	private String sId;
	private String tId;





	static ArrayList<CourseClass> courseList;
	


	public CourseClass(){};


	public CourseClass(  String cId, String name , int seat, String section,String sId, String tId	){


			  this.cId = cId;
			  this.name = name;
			  this.seat = seat;
			  this.section = section;
			  this.sId = sId;
			  this.tId = tId;



	}
	public CourseClass(  String name , int seat, String section,String sId, String tId	){


			  this.name = name;
			  this.seat = seat;
			  this.section = section;
			  this.sId = sId;
			  this.tId = tId;



	}






	public void setCId(String cId){
		 this.cId = cId;
	}
	public String getCId(){
		return this.cId;
	}



	public void setName(String name){
		 this.name = name;
	}
	public String getName(){
		return this.name;
	}


	public void setSeat(int seat){
		 this.seat = seat;
	}
	public int getSeat(){
		return this.seat;
	}


	public void setSection(String section){
		 this.section = section;
	}
	public String getSection(){
		return this.section;
	}


	public void setSId(String sId){
		 this.sId = sId;
	}
	public String getSId(){
		return this.sId;
	}

	public void setTId(String tId){
		 this.tId = tId;
	}
	public String getTId(){
		return this.tId;
	}



	public static  ArrayList<CourseClass> getAllCourse(){

		courseList = ResultQuery.getAllCourse();

		return courseList;
	}

	public static  ArrayList<CourseClass> getCurrentCourse(String studentID){

		courseList = ResultQuery.getCurrentCourse(studentID);

		return courseList;
	}



	public static  ArrayList<CourseClass> regCourseAll(String studentID){

		courseList = ResultQuery.regCourseAll(studentID);

		return courseList;
	}






	public static  ArrayList<CourseClass> getTeacherCourses(UserClass u){

		courseList = ResultQuery.getTeacherCourses(u);

		return courseList;
	}





	
     public static String viewDetail(String str1){

     	return ResultQuery.findCourseDetails(str1);
     }






     public String toString() { 

         return this.cId + " - "+this.name+" ["+this.section+"] " ;
     }


}