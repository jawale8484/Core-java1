package com.hefshine.JDBC;
//4.WAP using JDBC to delete employees if their salaries are equal to 0.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_4th {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wrpracti_bookinfo", "root", "root");
													//"jdbc:mysql://localhost:3306/wrpracti_bookinfo";
		Statement st = con.createStatement();
		System.out.println("Connection established");
		
		ResultSet rs;
		String sql="delete from employees where salary=0";
		st.executeUpdate(sql);
		
		sql="select salary from employees";
		rs=st.executeQuery(sql);
		
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
		}
		con.close();
	}
}
