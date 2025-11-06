package com.example.database;

import java.sql.*;

public class JDBC_Ex1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_data", "root", "sangunhorung-3");
			System.out.println("DB Connecting success");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver load error");
		} catch (SQLException e) {
			System.out.println("DB Connecting error");
		}
	}
}
