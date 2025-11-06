package com.example.database;

import java.io.*;
import java.sql.*;

public class JDBC_Ex3 {
	public static void main (String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_data", "root", "sangunhorung-3");
			System.out.println("DB Connecting success");
			stmt = conn.createStatement();
			stmt.executeUpdate("insert into student (name, id, dept) values ('아무개', '0893012', '컴퓨터공학');");
		    printTable(stmt);
		    stmt.executeUpdate("update student set id = '0189011' where name = '아무개'");
		    printTable(stmt);
		    stmt.executeUpdate("delete from student where name = '아무개'");
		    printTable(stmt);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver load error");
		} catch (SQLException e) {
			System.out.println("SQL Running error");
		}
	}
	
	private static void printTable(Statement stmt) throws SQLException {
		ResultSet srs = stmt.executeQuery("select * from student");
		while (srs.next()) {
			System.out.print(srs.getString("name"));
			System.out.print("\t|\t" + srs.getString("id"));
			System.out.println("\t|\t" + srs.getString("dept"));
		}
	}
}
