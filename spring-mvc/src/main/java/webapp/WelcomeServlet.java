package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/welcome")
public class WelcomeServlet extends HttpServlet {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	  @Override
	  protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
		  
		  httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest, httpServletResponse);
		  
	  }
	  
	  @Override
	  protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
		   ;
		  httpServletRequest.setAttribute("name", httpServletRequest.getParameter("username"));
		  httpServletRequest.setAttribute("password", httpServletRequest.getParameter("password"));
		  
		  httpServletRequest.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(httpServletRequest, httpServletResponse);
		  
	  }
}
