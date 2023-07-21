package com.jdbc_simple_crud_project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdateController {

	public static void main(String[] args) {
	Connection connection=null;	
   try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
//	step-2 create connection
	String url="jdbc:mysql://localhost:3306/jdbc";
	String user="root";
	String pass="root";
	
	connection = DriverManager.getConnection(url,user,pass);
	//step-3 create statement
	Statement statement=connection.createStatement();
	//step-4 execute Query
	
	String updateStudentEmailQuery = "update student set email='amit123@gmail.com' WHERE id=101";
	
	int a=statement.executeUpdate(updateStudentEmailQuery);
	if(a==1) {
		System.out.println("Data---Updated----");
	}else {
		System.out.println("Given id is not present");
	}
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	}
	}