package main.student;

import java.util.*;
import java.text.*;
import main.connection.*;
import main.user.*;

public class StudentClass {


	private String sId ;
	private String firstName ;
	private String lastName;
	private String birthDate;
	private String joinDate;
	private String address;
	private String contactNo;
	private String parentsName;
	private String parentsContactNo;
	private String email;
	private UserClass user;





	static ArrayList<StudentClass> studentList;
	static Date date= new Date();
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public StudentClass(){

		this.user = new UserClass();

	};


	public StudentClass( String sId, String firstName,String lastName,String birthDate, String joinDate,String address,String contactNo,
						String parentsName,String parentsContactNo,String email,String uId,String password, String fId	){


			  this.sId = sId;
			  this.firstName = firstName;
			  this.lastName = lastName;
			  this.birthDate = birthDate;
			  this.joinDate = sdf.format(date);
			  this.address = address;
			  this.contactNo = contactNo;
			  this.parentsName = parentsName;
			  this.parentsContactNo =parentsContactNo;
			  this.email = email;
			  user = new UserClass(uId, password , fId);



	}

	public	StudentClass(String firstName,String lastName,String birthDate,String joinDate,String address,String contactNo,String parentsName,

				String parentsContactNo,String email){

			  this.user = new UserClass();
			  this.firstName = firstName;
			  this.lastName = lastName;
			  this.birthDate = birthDate;
			  this.joinDate = joinDate;
			  this.address = address;
			  this.contactNo = contactNo;
			  this.parentsName = parentsName;
			  this.parentsContactNo =parentsContactNo;
			  this.email = email;





	}


	public	StudentClass(String sId ,String firstName,String lastName,String birthDate,String joinDate,String address,String contactNo,String parentsName,

				String parentsContactNo,String email){

			  this.sId = sId;
			  this.firstName = firstName;
			  this.lastName = lastName;
			  this.birthDate = birthDate;
			  this.joinDate = joinDate;
			  this.address = address;
			  this.contactNo = contactNo;
			  this.parentsName = parentsName;
			  this.parentsContactNo =parentsContactNo;
			  this.email = email;





	}

	public	StudentClass(String firstName,String lastName,String birthDate,String address,String contactNo,String parentsName,

				String parentsContactNo,String email){

			  this.user = new UserClass();
			  this.firstName = firstName;
			  this.lastName = lastName;
			  this.birthDate = birthDate;
			  this.joinDate = sdf.format(date);
			  this.address = address;
			  this.contactNo = contactNo;
			  this.parentsName = parentsName;
			  this.parentsContactNo =parentsContactNo;
			  this.email = email;





	}

	public void setUserPassword(String password){


		
		this.user.setPassword(password);
	}

	public String getUserPassword(){


		
		return this.user.getPassword();
	}


	public void setSId(String sId){
		 this.sId = sId;
	}
	public String getSId(){
		return this.sId;
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


	public void setParentsName(String parentsContactNO){
		 this.parentsName = parentsName;
	}
	public String getParentsName(){
		return this.parentsName;
	}


	public void setParentsContactNo(String parentsContactNo){
		 this.parentsContactNo = parentsContactNo;
	}
	public String getParentsContactNo(){
		return this.parentsContactNo;
	}

	public void setEmail(String email){
		 this.email = email;
	}
	public String getEmail(){
		return this.email;
	}







	public static void createStudent(StudentClass s1){

		ResultQuery.createStudent(s1);


		

	}

		public static void getStudent(){

		studentList = ResultQuery.getStudent();

		for(StudentClass s1 : studentList){

			System.out.println(s1.toString());
		}
		

	}

	public static ArrayList<StudentClass> viewCourseStudents(String cId){

		

		return  ResultQuery.viewCourseStudents(cId);


	}


	public String toString() { 

         return this.sId + " - "+this.lastName+", "+this.firstName ;
     }



	public static void registerCourse(String studentId,String courseId){

		ResultQuery.registerCourse(studentId,courseId);


		

	}
     

}