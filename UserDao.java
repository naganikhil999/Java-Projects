package com.naga.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.naga.User.User;

public class UserDao {
	
	public int registeruser(User user) throws SQLException, ClassNotFoundException {
		
		String query = "INSERT INTO userdetails VALUES(? , ? , ?, ? ,? ,?)";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/UserRegister" , "root" , "12345");
				
				PreparedStatement st = connection.prepareStatement(query)){
			 st.setString(1, user.getFirstName());
			 st.setString(2, user.getLastName());
			 st.setString(3, user.getUserName());
			 st.setString(4, user.getPassWord());
			 st.setString(5, user.getAddress());
			 st.setString(6, user.getContact());
			 
			 System.out.println(st);
			 
			 result = st.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
		return result;
	}
	
	 private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
}
