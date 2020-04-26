package com.webmvc.jee;

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

	UserValidationService userValidationService = new UserValidationService();

	@Override
	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException, ServletException {

		httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest,
				httpServletResponse);

	}

	@Override
	protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException, ServletException {
		;
		String username = httpServletRequest.getParameter("username");
		String password = httpServletRequest.getParameter("password");

		httpServletRequest.setAttribute("name", username);
		httpServletRequest.setAttribute("password", password);
		
		if(userValidationService.validateUser(username, password))
		httpServletRequest.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(httpServletRequest,
				httpServletResponse);
		else {
			httpServletRequest.setAttribute("errorMessage", "Invalid Credentials");
			httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest,
					httpServletResponse);
			}

	}
}
