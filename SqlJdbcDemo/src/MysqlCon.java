import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlCon {
	  
		public static void main(String args[]){  
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con;

			con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/studentdb","root","***");
		 
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from student");  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));  
		con.close();  
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		}
		
		
		
		
		
		
		



