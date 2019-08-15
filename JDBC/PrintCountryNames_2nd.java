package com.hefshine.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//2.	WAP using JDBC to select and print all country names.
public class PrintCountryNames_2nd {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wrpracti_bookinfo", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs;
		String sql="select country_name from countries";
		rs=st.executeQuery(sql);
		System.out.println("Query executed");

	while(rs.next()) {
		System.out.println(rs.getString(1));
	}
	con.close();
	}
}
