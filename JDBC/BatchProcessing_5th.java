package com.hefshine.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BatchProcessing_5th {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hefshinedata", "root", "root");
		// "jdbc:mysql://localhost:3306/wrpracti_bookinfo";
		Statement st = con.createStatement();
		ResultSet rs;
		String sql = "insert into company values(105,'nike')";
		st.addBatch(sql);

		st.executeBatch();
		sql = "select * from company";
		rs = st.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}

		con.close();

	}

}
