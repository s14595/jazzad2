package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import repositories.DummyUserRepository;
import repositories.UserRepository;

@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddUserServlet() {
        super();
        
    }
    
    private User retrieve (HttpServletRequest request){
    	User result = new User();
    	result.setLogin(request.getParameter("login"));
    	result.setPassword(request.getParameter("password"));
    	result.setEmail(request.getParameter("email"));
    	return result;
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		User user = retrieve(request);
		UserRepository repository = new DummyUserRepository();
		
		session.setAttribute("account", user);
		repository.add(user);
		response.getWriter().println("Success!");
		response.sendRedirect("profile.jsp");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
