package com.hefshine.JDBC;
//3.	WAP  to update a record in the database using JDBC?
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_3rd {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wrpracti_bookinfo","root","root");
												//"jdbc:mysql://localhost:3306/wrpracti_bookinfo";
	Statement st=con.createStatement();
	System.out.println("Connection done");
	ResultSet rs;
	System.out.println("result set");
	String sql="update employees set first_name='suhas' where first_name='steven'";
	st.executeUpdate(sql);
	
	sql="select * from employees";
	rs=st.executeQuery(sql);
	
	System.out.println("Query executed");
	System.out.println("E_id  FirstName  lastName");
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+"     "+rs.getString(3));
	}
con.close();

}
}
