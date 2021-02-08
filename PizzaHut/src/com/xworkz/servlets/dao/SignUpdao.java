package com.xworkz.servlets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.servlets.dto.SignUpdto;

public class SignUpdao {

	public void registration(SignUpdto signupdto) throws ClassNotFoundException {

		String sqlQuery = "insert into pizza_table values(?,?,?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");

				PreparedStatement prep = conn.prepareStatement(sqlQuery); ) { 
			
		    prep.setString(1, null);
			prep.setString(2, signupdto.getName());
			prep.setString(3, signupdto.getEmail());
			prep.setInt(4, signupdto.getPasssword());
			prep.setInt(5, signupdto.getPhoneNumber());
			System.out.println(prep);
			int result =prep.executeUpdate();
			System.out.println(result);

			
			


		} catch (Exception e) {
			e.printStackTrace();		}

	}

//		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user" ,"root", "root"); 
//
//				PreparedStatement prep = conn.prepareStatement(sqlQuery);
//			){
//			prep.setInt(1, 1);
//			prep.setString(2, SignUpdto.getName());
//			prep.setString(3, SignUpdto.getEmail());
//			prep.setInt(4, SignUpdto.getPassword());
//			prep.setLong(5, SignUpdto.getPhoneNumerL());
//			System.out.println(prep);
//			int result =prep.executeUpdate();
//			System.out.println(result);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

}
