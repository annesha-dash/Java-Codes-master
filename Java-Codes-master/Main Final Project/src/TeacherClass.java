package main.teacher;

import java.util.*;
import java.text.*;
import main.connection.*;
import main.user.*;

public class TeacherClass {


	private String tId ;
	private String firstName ;
	private String lastName;
	private String birthDate;
	private String joinDate;
	private String address;
	private String contactNo;
	private String email;
	private UserClass user;





	static ArrayList<TeacherClass> teacherList;
	static Date date = new Date();
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public TeacherClass(){};


	public TeacherClass( String tId, String firstName,String lastName,String birthDate, String joinDate,String address,String contactNo,
						String email,String uId,String password, String fId	){


			  this.tId = tId;
			  this.firstName = firstName;
			  this.lastName = lastName;
			  this.birthDate = birthDate;
			  this.joinDate = joinDate;
			  this.address = address;
			  this.contactNo = contactNo;

			  this.email = email;
			  user = new UserClass(uId, password , fId);



	}



	public	TeacherClass(String firstName,String lastName,String birthDate,String joinDate ,String address,String contactNo,String email){



			  this.firstName = firstName;
			  this.lastName = lastName;
			  this.birthDate = birthDate;
			  this.joinDate = sdf.format(date);
			  this.address = address;
			  this.contactNo = contactNo;
			  this.email = email;





	}

		public	TeacherClass(String firstName,String lastName,String birthDate,String address,String contactNo,String email){

			  this.user = new UserClass();
			  this.tId = tId;
			  this.firstName = firstName;
			  this.lastName = lastName;
			  this.birthDate = birthDate;
			  this.joinDate = sdf.format(date);
			  this.address = address;
			  this.contactNo = contactNo;
			  this.email = email;





	}


	public void setUserPassword(String password){


		
		this.user.setPassword(password);
	}

	public String getUserPassword(){


		
		return this.user.getPassword();

	}



	public void setTId(String tId){
		 this.tId = tId;
	}
	public String getTId(){
		return this.tId;
	}



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


	public void setBirthDate(String birthDate){
		 this.birthDate = birthDate;
	}
	public String getBirthDate(){
		return this.birthDate;
	}


	public void setJoinDate(String joinDate){
		 this.joinDate = joinDate;
	}
	public String getJoinDate(){
		return this.joinDate;
	}


	public void setAddress(String address){
		 this.address = address;
	}
	public String getAddress(){
		return this.address;
	}



	public void setContactNo(String contactNo){
		 this.contactNo = contactNo;
	}
	public String getContactNo(){
		return this.contactNo;
	}


	
	public void setEmail(String email){
		 this.email = email;
	}
	public String getEmail(){
		return this.email;
	}







	/*public static void createTeacher(TeacherClass t1){

		ResultQuery.createTea(a1);


		

	}

	public static void getAdmin(){

		adminList = ResultQuery.getAdmin ();

		for(AdminClass a1 : adminList){

			System.out.println(a1.toString());
		}
		

	}*/


	//@Override



	/*
	public static void main(String[] args){

		//StudentClass s1 = new StudentClass("Faisal" , "Ahmed" , "05/12/1995 ","05/12/2015 ",  "Green road Dhaka" ,"016XXXXXXXX" ,"MR Y" ,"017XXXXXXXX" ,  "ahmed.faisal@GMAIL.COM");

		//StudentClass.createStudent(s1);
		UserClass u = new UserClass("15300131" ,"678876");

		//System.out.println(u.getFId());

		//getStudent();

	}*/



}