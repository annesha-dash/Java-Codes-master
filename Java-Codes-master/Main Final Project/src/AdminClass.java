package main.admin;

import java.util.*;
import java.text.*;
import main.connection.*;
import main.user.*;

public class AdminClass {


	private String aId ;
	private String firstName ;
	private String lastName;
	private String birthDate;
	private String joinDate;
	private String address;
	private String contactNo;
	private String email;
	private UserClass user;





	static ArrayList<AdminClass> adminList;
	static Date date = new Date();
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public AdminClass(){};


	public AdminClass( String aId, String firstName,String lastName,String birthDate, String joinDate,String address,String contactNo,
						String email,String uId,String password, String fId	){


			  this.aId = aId;
			  this.firstName = firstName;
			  this.lastName = lastName;
			  this.birthDate = birthDate;
			  this.joinDate = joinDate;
			  this.address = address;
			  this.contactNo = contactNo;

			  this.email = email;
			  user = new UserClass(uId, password , fId);



	}



	public	AdminClass(String firstName,String lastName,String birthDate,String joinDate ,String address,String contactNo,String email){



			  this.firstName = firstName;
			  this.lastName = lastName;
			  this.birthDate = birthDate;
			  this.joinDate = sdf.format(date);
			  this.address = address;
			  this.contactNo = contactNo;
			  this.email = email;





	}


	public void setAId(String aId){
		 this.aId = aId;
	}
	public String getSAd(){
		return this.aId;
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







	/*public static void createAdmin(AdminClass a1){

		ResultQuery.createAdmin(a1);


		

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