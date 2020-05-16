package com.careyconnect.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	
	public String DataBaseURL = "jdbc:mysql://localhost:3306/champs_new_db?useSSL=false";
	boolean useSSL = true;
	public String userName = "root";
	public String password = "C@r3y123";
	public Statement stmt;
	public ResultSet rs;
	public Connection con;

	public Statement getStatement() {
     
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//System.out.println("Driver Loaded");
			con = DriverManager.getConnection(DataBaseURL, userName, password);
			//System.out.println("ConnectionEstablished");
			stmt = con.createStatement();
			
		   } catch (SQLException ex) {
			//System.out.println("Error: Please enter correct DB details under Configuration tab.");
		   } catch (Exception e) {
			e.printStackTrace();
		   }
	       return stmt;	
}
	
	public ResultSet getData(String query) throws SQLException {
		
		rs = stmt.executeQuery(query);

		return rs;
	}

	public void insertData(String update) throws SQLException {
		
		System.out.println(update);
		stmt.executeUpdate(update);
		
	}
	
	public void close() throws SQLException {
		con.close();}

}
