package com.jspiders.myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class MyFirstProgram {

	public static void main(String[] args) {               // load the driver
												           // establish the database connection via driver
		Connection con = null;                             // issue sql query via connection
		PreparedStatement pstmt = null;                    // process the result returned by the sql query
		ResultSet rs = null;                               // close all the jdbc objects

		try {
			
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);

			String dburl = "jdbc:mysql://localhost:3306/sample?user=root&password=root";// protocal,subprotocal,subname,port
																						// no,dbname,username,password,?placeholder

			con = DriverManager.getConnection(dburl);

			String query = "select * from studentinfo";

			pstmt = con.prepareStatement(query);
 
			rs = pstmt.executeQuery();

			while (rs.next()) {

				int regNum = rs.getInt("regno");
				String fName = rs.getString("fname");
				String mName = rs.getString("mname");
				String lName = rs.getString("lname");

				System.out.println("regNO :" + regNum);
				System.out.println("Firstname :" + fName);
				System.out.println("Middlename :" + mName);
				System.out.println("Lastname :" + lName);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e2) {

				e2.printStackTrace();
			}
		}

	}

}
