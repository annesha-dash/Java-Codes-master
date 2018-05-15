package main.connection;

import java.sql.*;
import main.student.*;
import main.teacher.*;
import main.admin.*;
import main.course.*;
import java.util.*;
import main.course.*;
import main.user.*;
import main.grade.*;

public class ResultQuery {
    
   	static String password1;



   	// ######################### ~~~~~~~~~~~~~~~~~~~~LOGIN QUERY!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~############################## 

    public static boolean login( String name , String password){
        Connect con = new Connect();

		String query = "select U_PASSWORD from MANAGEMENT.USERS where U_ID = '"+name.toUpperCase()+"'";
		

		ResultSet rs = con.getResult(query);
		try{
			while(rs.next()){
				

				password1 = rs.getString(1);
			}
		}catch(Exception e){System.out.println(e); }



		
        if( password.equals(password1)){

            return true;
        }

        else return false;


    }


    // #######################~~~~~~~~~~~~~~~~~~~~~~~~~ Set user Fid ~~~~~~~~~~~~~~~~~~~~~~~~~~###########################

    public static String getStudentFId(String uId ,String password){
    	Connect con = new Connect();
    	String query = "SELECT U_FID FROM MANAGEMENT.USERS WHERE U_ID = '"+uId+"' AND  U_PASSWORD = '"+password+"' " ;
		String temp = new String();


		ResultSet rs = con.getResult(query);		

		try{
			while(rs.next()){
				

				temp = rs.getString(1);
				
			}
		}catch(Exception e){System.out.println(e); }
		
		return temp;

    }


        public static String getAdminFId(String uId ,String password){
    	Connect con = new Connect();
    	String query = "SELECT U_FID FROM MANAGEMENT.USERS WHERE U_ID = '"+uId+"' AND  U_PASSWORD = '"+password+"' " ;
		String temp = new String();

		ResultSet rs = con.getResult(query);		

		try{
			while(rs.next()){
				

				temp = rs.getString(1);
				
			}
		}catch(Exception e){System.out.println(e); }
		
		return temp;




    }


        public static String getTeacherFId(String uId ,String password){
    	Connect con = new Connect();
    	String query = "SELECT U_FID FROM MANAGEMENT.USERS WHERE U_ID = '"+uId+"' AND  U_PASSWORD = '"+password+"' " ;
		String temp = new String();

		
		ResultSet rs = con.getResult(query);		

		try{
			while(rs.next()){
				

				temp = rs.getString(1);
				
			}
		}catch(Exception e){System.out.println(e); }
		
		return temp;




    }

    // ####################~~~~~~~~~~~~~~~~~~~~~~~~~~~~ FIND USER DETAILS ~~~~~~~~~~~~~~~~~~~~~~~~~~################################

    public static StudentClass findStudent(String fId ){
    	Connect con = new Connect();
    	String query = "SELECT * FROM MANAGEMENT.STUDENT WHERE S_ID = '"+fId+"' " ;
  
    	StudentClass s1 = new StudentClass();

		ResultSet rs = con.getResult(query);		

		try{
			while(rs.next()){
				
				
			s1 = new StudentClass( rs.getString(2),rs.getString(3),
    		rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10) );

		

				
			}
		}catch(Exception e){System.out.println(e); }
		
		

			return s1;

    }


        public static AdminClass findAdmin(String fId ){


    	Connect con = new Connect();
    	String query = "SELECT * FROM MANAGEMENT.ADMIN WHERE A_ID = '"+fId+"' " ;
    	
    	
    	AdminClass a1 = new AdminClass();

		

		ResultSet rs = con.getResult(query);		

		

		try{
			while(rs.next()){
			

			a1 = new AdminClass( rs.getString(2),rs.getString(3),
    		rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8) );

		

				
			}
		}catch(Exception e){System.out.println(e); }
		
		



			return a1;



    }


        public static TeacherClass findTeacher(String fId ){
    	Connect con = new Connect();
    	String query = "SELECT * FROM MANAGEMENT.TEACHER WHERE T_ID = '"+fId+"' " ;
    
    	TeacherClass t1 = new TeacherClass();

		ResultSet rs = con.getResult(query);		

		try{
			while(rs.next()){
			

			t1 = new TeacherClass(rs.getString(2),rs.getString(3),
    		rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8) );

		

				
			}
		}catch(Exception e){System.out.println(e); }
		
		

			return t1;

    }







    // ################################# ~~~~~~~~~~~~~~~~~~ STUDENT QUERY ! ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~###################################
   

    
    public static ArrayList<StudentClass> getStudent(){
    	

    	ArrayList<StudentClass> studentList = new ArrayList<StudentClass>();


    	Connect con = new Connect();
    	String query = "select * from MANAGEMENT.STUDENT ";

    	ResultSet rs = con.getResult(query);
		try{
    	while (rs.next()){
    		
    		StudentClass s1 = new StudentClass( rs.getString(2),rs.getString(3),
    		rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10) );

    		studentList.add(s1);

    		
    	}
    }catch(Exception e){System.out.println(e); }


	return studentList;
    }





     public static void registerCourse(String studentId,String courseId){


     	Connect con = new Connect();
        String midId = new String();
        String finalId = new String();
		String query = "INSERT INTO MANAGEMENT.MID_GRADE(M_ID) VALUES (MANAGEMENT.M_GRADE.NEXTVAL)";
		con.ini(query); 
		query = "SELECT MAX(M_ID) FROM MANAGEMENT.MID_GRADE";


		ResultSet rs = con.getResult(query);
		try{
		while( rs.next() ){

			midId = rs.getString(1);


		}}catch(Exception e){System.out.println(e); }

		query = "INSERT INTO MANAGEMENT.FINAL_GRADE(F_ID) VALUES (MANAGEMENT.F_GRADE.NEXTVAL)";
		con.ini(query); 


		query = "SELECT MAX(F_ID) FROM MANAGEMENT.FINAL_GRADE";
		rs = con.getResult(query);
		try{
		while( rs.next() ){

			finalId = rs.getString(1);


		}}catch(Exception e){System.out.println(e); }



		query = "INSERT INTO MANAGEMENT.GRADE(G_ID, G_C_ID ,G_S_ID ,G_M_ID ,G_F_ID) VALUES(MANAGEMENT.G_GRADE.NEXTVAL ,'"+ courseId +"'  , '"+studentId+"' , '"+midId+"' , '"+finalId+"')";



		con.ini(query); 


     }





    // #################################~~~~~~~~~~~~~~~~~~~~~~~ Teacher query ! ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~################################

        public static  ArrayList<CourseClass> getTeacherCourses(UserClass u){

    	Connect con = new Connect();
		ArrayList<CourseClass> courseList = new ArrayList<CourseClass> ();

		String query = "SELECT * FROM MANAGEMENT.COURSE WHERE C_T_ID  in "+u.getFId()+ " and C_S_ID = (SELECT MAX(S_ID) FROM MANAGEMENT.SEMESTER)";
		
		System.out.println(query);

		ResultSet rs = con.getResult(query);
		try{
		while( rs.next() ){

			CourseClass temp = new CourseClass(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));

			courseList.add(temp);



		}}catch(Exception e){System.out.println(e); }



		return courseList;
		
	}


    public static  ArrayList<StudentClass> viewCourseStudents(String cId){

    	Connect con = new Connect();
		ArrayList<StudentClass> studentList = new ArrayList<StudentClass> ();

		String query = "SELECT STUDENT.* FROM MANAGEMENT.STUDENT FULL OUTER JOIN MANAGEMENT.GRADE ON STUDENT.S_ID = GRADE.G_S_ID WHERE GRADE.G_C_ID = " +cId;
		

		ResultSet rs = con.getResult(query);

		try{
		while(rs.next()){

			StudentClass temp = new StudentClass(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
				rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));

			studentList.add(temp);



		}}catch(Exception e){System.out.println(e); }



		return studentList;
		
	}



	


    // ################################# ~~~~~~~~ Admin Query ~~~~~~~~~~##########################################


    public static void createStudent(StudentClass s1){
        Connect con = new Connect();
        String temp = new String();
		String query = "INSERT INTO MANAGEMENT.STUDENT VALUES (MANAGEMENT.S_STUDENT.NEXTVAL , '" +s1.getFirstName().toUpperCase() + 
				 "' , '"+s1.getLastName().toUpperCase() +"' , '"+ s1.getBirthDate() +"', '"+ 
				 s1.getJoinDate() +"' , '" +s1.getAddress().toUpperCase() + "' , '"+ s1.getContactNo() + "', '" +
				 s1.getParentsName().toUpperCase() + "','" +s1.getParentsContactNo() + "','" + s1.getEmail().toUpperCase() + "' )";


				 con.ini(query);

				 query = "SELECT S_ID FROM MANAGEMENT.STUDENT WHERE S_FIRST_NAME = '"+s1.getFirstName().toUpperCase()+"' AND  S_LAST_NAME = '"+
				 		s1.getLastName().toUpperCase()+ "' AND S_EMAIL = '"+ s1.getEmail().toUpperCase() +"' " ;
				
				ResultSet rs = con.getResult(query);
				try{
				while(rs.next()){
					
					temp = rs.getString(1);

				}
			}catch(Exception e){System.out.println(e); }

				query = "INSERT INTO MANAGEMENT.USERS VALUES (MANAGEMENT.U_STUDENT.NEXTVAL , '"+s1.getUserPassword()+"' , '" + temp + "' )" ;
				
				con.ini(query); 


    }


	 public static void createTeacher(TeacherClass t1){
        Connect con = new Connect();
        String temp = new String();
		String query = "INSERT INTO MANAGEMENT.TEACHER VALUES (MANAGEMENT.T_TEACHER.NEXTVAL , '" +t1.getFirstName().toUpperCase() + 
				 "' , '"+t1.getLastName().toUpperCase() +"' , '"+ t1.getBirthDate() +"', '"+ 
				 t1.getJoinDate() +"' , '" +t1.getAddress().toUpperCase() + "' , '"+ t1.getContactNo() + "', '" 
				 + t1.getEmail().toUpperCase() + "' )";


				 con.ini(query);

				 query = "SELECT T_ID FROM MANAGEMENT.TEACHER WHERE T_FIRST_NAME = '"+t1.getFirstName().toUpperCase()+"' AND  T_LAST_NAME = '"+
				 		t1.getLastName().toUpperCase()+ "' AND T_EMAIL = '"+ t1.getEmail().toUpperCase() +"' " ;
				
				ResultSet rs = con.getResult(query);
				try{
				while(rs.next()){
					
					temp = rs.getString(1);

				}
				}catch(Exception e){System.out.println(e); }

				query = "INSERT INTO MANAGEMENT.USERS VALUES (MANAGEMENT.U_TEACHER.NEXTVAL , '"+t1.getUserPassword()+"' , '" + temp + "' )" ;
				
				con.ini(query); 


    }    	





    	 public static void createCourse(CourseClass c1){
        Connect con = new Connect();
      
		String query = "INSERT INTO MANAGEMENT.COURSE VALUES (MANAGEMENT.C_COURSE.NEXTVAL , '" +c1.getName().toUpperCase() + 
				 "' , "+ c1.getSeat() +" , '"+ c1.getSection().toUpperCase() +"' , '"+ 
				 c1.getSId().toUpperCase() +"' , '" +c1.getTId().toUpperCase() + "' )";


				 con.ini(query);

				
		} 



		 public static void createSemester(String name){
        Connect con = new Connect();
      
		String query = "INSERT INTO MANAGEMENT.SEMESTER VALUES (MANAGEMENT.S_SEMESTER.NEXTVAL , '" +name.toUpperCase()+"' )";


				 con.ini(query);

				
		} 






    //#################################~~~~~~~~~~ Course queries ~~~~~~~~~~~~~~###################################


    public static  ArrayList<CourseClass> getAllCourse(){

    	Connect con = new Connect();
		ArrayList<CourseClass> courseList = new ArrayList<CourseClass> ();

		String query = "SELECT * FROM MANAGEMENT.COURSE ";

		ResultSet rs = con.getResult(query);
		try{
		while(rs.next()){

			CourseClass temp = new CourseClass(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));

			courseList.add(temp);



		}}catch(Exception e){System.out.println(e); }



		return courseList;
		
	}

	  public static  ArrayList<CourseClass> getCurrentCourse(String studentId){

    	Connect con = new Connect();
		ArrayList<CourseClass> courseList = new ArrayList<CourseClass> ();

		String query = "SELECT * FROM MANAGEMENT.COURSE WHERE  C_S_ID = (SELECT MAX(S_ID) FROM MANAGEMENT.SEMESTER) AND C_ID IN (SELECT G_C_ID FROM MANAGEMENT.GRADE WHERE G_S_ID ="+ studentId +" )";
		//System.out.println(query);

		ResultSet rs = con.getResult(query);
		try{
		while(rs.next()){

			CourseClass temp = new CourseClass(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));

			courseList.add(temp);



		}}catch(Exception e){System.out.println(e); }



		return courseList;
		
	}



	public static  String findCourseDetails(String temp){

    	Connect con = new Connect();
		String result = new String();
		
		

		String query = "SELECT C_NAME,C_SEATS,T_FIRST_NAME FROM MANAGEMENT.TEACHER INNER JOIN MANAGEMENT.COURSE ON MANAGEMENT.COURSE.C_T_ID = MANAGEMENT.TEACHER.T_ID WHERE MANAGEMENT.COURSE.C_ID = "+temp ;
	//	System.out.println(query);

		ResultSet rs = con.getResult(query);
		try{
		while(rs.next()){


			result =  "Course Name :"+rs.getString(1)+"\n"+"Seat Capacity :"+rs.getString(2)+"\n"+"Course Teacher :"+rs.getString(3);



		}}catch(Exception e){System.out.println(e); }



		return result;
		
	}



	 public static  ArrayList<CourseClass> regCourseAll(String studentId){

	    	Connect con = new Connect();
			ArrayList<CourseClass> courseList = new ArrayList<CourseClass> ();

			String query = "SELECT * FROM MANAGEMENT.COURSE WHERE NOT C_ID IN (SELECT G_C_ID FROM MANAGEMENT.GRADE WHERE G_S_ID ="+ studentId +" )";

			ResultSet rs = con.getResult(query);
			try{
			while(rs.next()){

				CourseClass temp = new CourseClass(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));

				courseList.add(temp);



			}}catch(Exception e){System.out.println(e); }



			return courseList;
			
		}


		




//###################################################### ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ GRADE QUERY ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~##############################################


	public static MidGradeClass getMidGrade (String cId,String sId){

		 Connect con = new Connect();
      		
			String query="SELECT G_M_ID FROM MANAGEMENT.GRADE WHERE G_C_ID ="+cId+" AND G_S_ID = "+sId;
			//System.out.println(query);

			ResultSet rs = con.getResult(query);
			String mId = new String();
			MidGradeClass temp = new MidGradeClass();

			try{
			while(rs.next()){


				mId = rs.getString(1);



			}}catch(Exception e){System.out.println(e); }

			query = "SELECT * FROM MANAGEMENT.MID_GRADE WHERE M_ID = '" +mId+"'" ;

		//System.out.println(query);

			
			rs = con.getResult(query);


			try{
			while(rs.next()){


				 temp = new MidGradeClass( rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),
														rs.getInt(6),rs.getInt(7) );

				 
				

				}

			}catch(Exception e){System.out.println(e); }


				
			return temp;
	}


	public static void createMidGrade (MidGradeClass mg,String cId,String sId){

		 Connect con = new Connect();
      		
			String query="SELECT G_M_ID FROM MANAGEMENT.GRADE WHERE G_C_ID ="+cId+"AND G_S_ID = '"+sId+"'" ;
			//System.out.println(query);

			ResultSet rs = con.getResult(query);
			String mId = new String();


			try{
			while(rs.next()){


				mId = rs.getString(1);



			}}catch(Exception e){System.out.println(e); }

			query = "UPDATE MANAGEMENT.MID_GRADE SET M_Q1 ="+mg.getMQ1() +",M_Q2 ="+ mg.getMQ2() +",M_Q3 ="+ mg.getMQ3() +" ,M_ATTENDANCE=" + mg.getMAttendance()
								+  " ,M_PERFORMANCE="+ mg.getMPerformence() + " ,M_WRITTEN=" + mg.getMWritten()+ " WHERE M_ID = " +mId ;

			//System.out.println(query);
				 con.ini(query);


	}




	public static void updateMidGrade (String cId,String sId,MidGradeClass m1){

		 Connect con = new Connect();
      		
			String query="SELECT G_M_ID FROM MANAGEMENT.GRADE WHERE G_C_ID ="+cId+" AND G_S_ID = "+sId;
		

			ResultSet rs = con.getResult(query);
			String mId = new String();
		
			try{
			while(rs.next()){


				mId = rs.getString(1);



			}}catch(Exception e){System.out.println(e); }

			query = "UPDATE MANAGEMENT.MID_GRADE SET M_Q1= "+m1.getMQ1()+" , M_Q2= "+m1.getMQ2()+", M_Q3= "+m1.getMQ3()+" ,  M_ATTENDANCE= "+m1.getMAttendance()+" , M_PERFORMANCE="+m1.getMPerformence()+ 
					" , M_WRITTEN="+m1.getMWritten() +" WHERE M_ID = "+mId ;


			//		System.out.println(query);

				
			 con.ini(query);


	}




		public static FinalGradeClass getFinalGrade (String cId,String sId){

		 Connect con = new Connect();
      		
			String query="SELECT G_F_ID FROM MANAGEMENT.GRADE WHERE G_C_ID ="+cId+"AND G_S_ID = '"+sId+"'" ;
			

			ResultSet rs = con.getResult(query);
			String fId = new String();
			FinalGradeClass temp = new FinalGradeClass();

			try{
			while(rs.next()){


				fId = rs.getString(1);



			}}catch(Exception e){System.out.println(e); }

			query = "SELECT * FROM MANAGEMENT.FINAL_GRADE WHERE F_ID = '" +fId+"'" ;

			
			rs = con.getResult(query);


			try{
			while(rs.next()){


				 temp = new FinalGradeClass( rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),
														rs.getInt(6),rs.getInt(7) );

				 
				

				}

			}catch(Exception e){System.out.println(e); }


				
			return temp;
	}




	public static void createFinalGrade (FinalGradeClass fg,String cId,String sId){

		 Connect con = new Connect();
      
			
			String query="SELECT G_F_ID FROM MANAGEMENT.GRADE WHERE G_C_ID ="+cId +"AND G_S_ID = '"+sId+"'" ;
			

			ResultSet rs = con.getResult(query);
			String fId = new String();


			try{
			while(rs.next()){


				fId = rs.getString(1);



			}}catch(Exception e){System.out.println(e); }

			query = "UPDATE MANAGEMENT.FINAL_GRADE SET F_Q1 ="+fg.getFQ1() +",F_Q2 ="+ fg.getFQ2() +",F_Q3 ="+ fg.getFQ3() +" ,F_ATTENDANCE=" + fg.getFAttendance()
								+  " ,F_PERFORMANCE="+ fg.getFPerformence() + " ,F_WRITTEN= " + fg.getFWritten()+ " WHERE F_ID = " +fId ;


				 con.ini(query);



	}





	public static void updateFinalGrade (String cId,String sId,FinalGradeClass f1){

		 Connect con = new Connect();
      		
			String query="SELECT G_F_ID FROM MANAGEMENT.GRADE WHERE G_C_ID ="+cId+" AND G_S_ID = "+sId;
		

			ResultSet rs = con.getResult(query);
			String fId = new String();
			FinalGradeClass temp = new FinalGradeClass();

			try{
			while(rs.next()){


				fId = rs.getString(1);



			}}catch(Exception e){System.out.println(e); }

			query = "UPDATE MANAGEMENT.FINAL_GRADE SET F_Q1= "+f1.getFQ1()+" , F_Q2= "+f1.getFQ2()+", F_Q3= "+f1.getFQ3()+" ,  F_ATTENDANCE= "+f1.getFAttendance()+" , F_PERFORMANCE="+f1.getFPerformence()+ 
					" , F_WRITTEN="+f1.getFWritten() +" WHERE F_ID = "+fId ;


				//	System.out.println(query);

				
			 con.ini(query);


	}


		public static void setGrade (double grade,String cId , String sId){

		 Connect con = new Connect();
      
			
		String query="UPDATE MANAGEMENT.GRADE SET G_GRADE = "+grade+" WHERE G_C_ID = "+ cId +" AND G_S_ID ="+sId ;
	//	System.out.println(query);

		 con.ini(query);



	}


		public static int getGrade (String cId , String sId){

		 Connect con = new Connect();
      
			
		String query="SELECT G_GRADE FROM MANAGEMENT.GRADE WHERE G_C_ID = "+ cId +" AND G_S_ID ="+sId ;
	//	System.out.println(query);

		ResultSet rs = con.getResult(query);
		int temp = 0;


		try{
			while(rs.next()){


				temp = rs.getInt(1);


			}}catch(Exception e){System.out.println(e); }



			return temp;


	}






//################################################### OTHER QUERY ##############################################################################



	public static  ArrayList<String> getCollumName(String tableName){
		 Connect con = new Connect();

		String query = "SELECT column_name FROM   all_tab_cols WHERE  table_name = '"+tableName+"'";
	//	System.out.println(query);

		ResultSet rs = con.getResult(query);


		ArrayList<String> col = new ArrayList<>();

		try{
			while(rs.next()){


				String temp = rs.getString(1) ;

				 col.add(temp);
				

			}}catch(Exception e){System.out.println(e); }



			return col;
		}











	}



