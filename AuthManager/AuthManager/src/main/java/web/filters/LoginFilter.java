package web.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;

@WebFilter({"/login"})
public class LoginFilter implements Filter{

	FilterConfig filterConfig = null;

	private ServletContext context;

	public void init(FilterConfig config) throws ServletException {
		this.context= config.getServletContext();
	}
	
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		PrintWriter out = resp.getWriter();
		
		HashMap<String,User> users = (HashMap<String,User>) context.getAttribute("users");
	
		if ((Boolean)context.getAttribute("logged")) chain.doFilter(req, resp);
		else
		if ((!(Boolean)context.getAttribute("logged"))&&(!users.keySet().contains(req.getParameter("login"))))resp.sendRedirect("loginPage");
		else
		if ((!(Boolean)context.getAttribute("logged"))&&(req.getParameter("password")!=null)&&(!users.get(req.getParameter("login")).getPassword().equals(req.getParameter("password"))))
		{
			resp.sendRedirect("login");
		}
		else 
		{
			req.getSession().setAttribute("login", req.getParameter("login").toString());
			context.setAttribute("logged", true);
			chain.doFilter(req, resp);
		}
		
		out.close();
		
	}
	public void destroy() {}


}