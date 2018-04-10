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

import domain.Access;
import domain.User;


@WebFilter("/premiumMan")
public class AdminFilter implements Filter{

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
	
		
		if (users.get(req.getSession().getAttribute("login")).getAccess()!=Access.admin)
		{
			resp.sendRedirect("profile");
		}
		else 
		{
			chain.doFilter(req, resp);
		}
		
		out.close();
		
	}
	public void destroy() {}


}
