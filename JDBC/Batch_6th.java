package com.hefshine.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

//6.	WAP for batch update using Prepared Statement.
public class Batch_6th {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hefshinedata", "root", "root");
		// "jdbc:mysql://localhost:3306/wrpracti_bookinfo";
		ResultSet rs;

		String sql = "insert into company values(?,?)";

		java.sql.PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 106);
		ps.setString(2, "adidas");
       
		ps.addBatch();
		
		ps.executeBatch();
		System.out.println("batch updated sussefully");

		sql = "select * from company";
		rs = ps.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
	con.close();
	}
}
