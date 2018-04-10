package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;

@WebServlet("/userlist")
public class UserListServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ServletContext app = getServletContext();
		response.setContentType("text/html");
		HashMap<String,User> users = (HashMap<String,User>) app.getAttribute("users");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h2>User List</h2>"
				+ "login, password, email, type<br><br>");
		if (users!=null){
			for (User u :users.values())
				out.print(u.getLogin()+", "+u.getPassword()+", "+u.getEmail()+" ("+u.getAccess().toString()+")<br>");
		}
				
		out.close();
	}

}
