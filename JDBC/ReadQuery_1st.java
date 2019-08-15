package com.hefshine.JDBC;

import java.sql.*;

public class ReadQuery_1st {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/wrpracti_bookinfo";
		String user = "root";
		String pwd = "root";
		java.sql.Connection con = DriverManager.getConnection(url, user, pwd);
		System.out.println("connection suces");
		Statement st = ((java.sql.Connection) con).createStatement();
		String sql;
		ResultSet rs;

		
		sql = "select * from regions";
		rs = st.executeQuery(sql);
		System.out.println("Query executed");

		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}
con.close();
	}

}
