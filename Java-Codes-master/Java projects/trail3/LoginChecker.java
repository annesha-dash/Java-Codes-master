
import java.sql.*;
/**
 * Created by sheeh on 11/18/2016.
 */
public class LoginChecker {
    static String name;
    static String password;
    public static void ini(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","asshole");

            Statement stmt=con.createStatement();
            ResultSet  rs = stmt.executeQuery("select password from MANAGEMENT.USERS where "+"name = '"+name.toUpperCase()+"'");




            while(rs.next()) {
                password = rs.getString(1);
            }



            con.close();


        }catch(Exception e){ System.out.println(e); }
    }

    public static boolean login( String name1 , String pssword1){
        name = name1;
        ini();

        if( password.equals(pssword1)){

            return true;
        }

        else return false;


    }

	public static void main(String []args){
		
		name = "pranto";
		ini();
		System.out.println(password);
		
		
		
	}

}
