package com.naga.UserServlet;

import java.io.IOException;

import com.naga.User.User;
import com.naga.UserDao.UserDao;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class UserServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao;
	
	public void init() {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		String FirstName = req.getParameter("firstname");
		String LastName = req.getParameter("lastname");
		String UserName = req.getParameter("username");
		String PassWord = req.getParameter("password");
		String Address = req.getParameter("address");
		String Contact = req.getParameter("number");
		
		User user = new User();
		user.setFirstName(FirstName);
		user.setLastname(LastName);
		user.setUserName(UserName);
		user.setPassWord(PassWord);
		user.setAddress(Address);
		user.setContact(Contact);
		
		try {
			userDao.registeruser(user);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		res.sendRedirect("UserDone.jsp");
	}

}
