package com.jdbc_simple_crud_project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentInsertController {
      
	public static void main(String[] args) {

		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			step-2 create connection
			String url="jdbc:mysql://localhost:3306/jdbc";
			String user="root";
			String pass="root";
			connection=DriverManager.getConnection(url,user,pass);
//			step-3 create statement
			Statement statement=connection.createStatement();
//			step-4 Execute Query
			String insertQuery="insert into student(id,name,email,phone) values(101,'aman','aman0412@gmail.com',990989)";
			statement.execute(insertQuery);
			
			System.out.println("Data Selected================");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
//				step-5 close the connection
				connection.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		
		}
	}
}

		
		
		
		

	
	

					
			
			
        

