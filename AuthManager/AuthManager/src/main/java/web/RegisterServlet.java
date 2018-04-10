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

import domain.Access;
import domain.User;


@WebServlet("/premiumMan")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		ServletContext app = getServletContext();	
		
		String login = request.getParameter("login");
		String type = request.getParameter("type").toString();
		Access access = Access.regular;
		
		if(type.equals("regular"))access=Access.regular;
		else 
			if(type.equals("premium"))access=Access.premium;
			else
				if(type.equals("admin"))access=Access.admin;
			
		((HashMap<String,User>) app.getAttribute("users")).get(login).setAccess(access);
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>User "+login+" has been changed to "+type+ ".</body></html>");
	
		
		out.close();
	}

}
