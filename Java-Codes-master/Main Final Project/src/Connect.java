package main.connection;

import java.sql.*;



public class Connect {
    String result;
	ResultSet  rs;
	


    public  void ini(String query){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","TIGER");

            Statement stmt=con.createStatement();
			rs= stmt.executeQuery(query); 
			
			
        }catch(Exception e){ System.out.println(e); }
		
			
    }
   

    public  ResultSet getResult(String query){
    	ini(query);
    	return rs;
    	
    }



}
