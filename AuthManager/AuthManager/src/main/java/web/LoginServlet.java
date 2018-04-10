package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import repositories.DummyUserRepository;
import repositories.UserRepository;


@WebServlet("/loginpage")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private User retrieve(HttpServletRequest request) {
		User result = new User();
	result.setLogin(request.getParameter("login"));
	result.setPassword(request.getParameter("password"));
	return result;
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	User user = retrieve(request);
	UserRepository repository = new DummyUserRepository();
	
	response.getWriter().println("Success!");
	response.sendRedirect("profile.jsp");
	}

}
