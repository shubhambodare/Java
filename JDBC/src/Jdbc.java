import java.sql.*;

public class Jdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","");
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from student");
		
		while(rs.next()) {
			System.out.println(""+rs.getString(1)+":"+rs.getString(2));
		}
		
		stm.close();
		con.close();
		
	}

}
